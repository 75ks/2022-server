package com.c4c._2022server.service.impl;

import java.util.Locale;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.Customer;
import com.c4c._2022server.entity.LoginUser;
import com.c4c._2022server.enums.AuthenticationTypeEnum;
import com.c4c._2022server.form.LoginReq;
import com.c4c._2022server.form.LoginRes;
import com.c4c._2022server.form.RegisterPasswordReq;
import com.c4c._2022server.mapper.CustomerMapper;
import com.c4c._2022server.service.CustomerAuthorizationService;
import com.c4c._2022server.utils.CommonUtils;
import com.c4c._2022server.utils.CookieUtils;
import com.c4c._2022server.utils.EntityUtils;
import com.c4c._2022server.utils.JWTUtils;

@Service
public class CustomerAuthorizationServiceImpl implements CustomerAuthorizationService {
    @Autowired
    EntityUtils entityUtils;
    @Autowired
    MessageSource messageSource;
    @Autowired
    CustomerMapper customerMapper;

    /**
     * ログイン
     * @param reqForm 画面からの入力値
     * @param response レスポンス
     * @return ログイン情報
     * @throws AuthenticationException
     */
    @Override
    public LoginRes signIn(LoginReq reqForm, HttpServletResponse response) throws AuthenticationException {
        String jwt;
        // メールアドレスをキーにユーザーを取得
        Customer customer = customerMapper.select0001(reqForm.getEmail());
        if (customer == null) {
            throw new AuthenticationException(messageSource.getMessage("error.email.not.registered", new String[]{}, Locale.getDefault()));
        }
        // 初回ログインの場合、パスワードがハッシュ化されていないため、通常チェックを行う
        if (CommonUtils.OFF == customer.getFirstLoginFlg()) {
            if (!reqForm.getPassword().equals(customer.getPassword())) {
                throw new AuthenticationException(messageSource.getMessage("error.password.not.match", new String[]{}, Locale.getDefault()));
            }
        // 初回ログインではない場合、パスワードがハッシュ化されているため、エンコードをしてチェックを行う
        } else {
            // 入力されたパスワードとDBのパスワード(ハッシュ化済み)を比較
            BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
            if (!bcpe.matches(reqForm.getPassword(), customer.getPassword())) {
                throw new AuthenticationException(messageSource.getMessage("error.password.not.match", new String[]{}, Locale.getDefault()));
            }
        }
        // JWTを生成&検証
        LoginUser loginuser = new LoginUser(customer.getCustomerId(), customer.getStoreId(), AuthenticationTypeEnum.CUSTOMER.getCode());
        JWTUtils instance = JWTUtils.getInstance();
        jwt = instance.createJWT(loginuser);
        // Cookieを設定
        CookieUtils.setCookie(response, "jwt", jwt);

        // レスポンスを作成
        LoginRes loginRes = new LoginRes();
        loginRes.setId(customer.getCustomerId());
        loginRes.setJwt(jwt);
        loginRes.setAuthenticationType(AuthenticationTypeEnum.CUSTOMER.getCode());
        loginRes.setFirstLoginFlg(customer.getFirstLoginFlg());
        return loginRes;
    }

    /**
     * ログアウト
     * @param request リクエスト
     * @param response レスポンス
     */
    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        CookieUtils.deleteCookie(request, response, "jwt");
    }

    /**
     * パスワード登録
     * @param customerId 顧客ID
     * @param reqForm 画面からの入力値
     */
    @Override
    public void registerPassword(int customerId, RegisterPasswordReq reqForm) {
        // パスワードをハッシュ化
        BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
        String encodeedPassword = bcpe.encode(reqForm.getPassword());

        Customer customer = new Customer();
        customer.setCustomerId(customerId);
        customer.setPassword(encodeedPassword);
        customer.setFirstLoginFlg(CommonUtils.ON);
        // UPDATE時の共通設定
        entityUtils.setColumns4Update(customer, customerId);
        // UPDATEを実行し、データを登録する
        customerMapper.updateByPrimaryKeySelective(customer);
    }
}
