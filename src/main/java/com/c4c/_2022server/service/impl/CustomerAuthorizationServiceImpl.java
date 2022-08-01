package com.c4c._2022server.service.impl;

import java.util.Locale;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.c4c._2022server.constants.AuthenticationType;
import com.c4c._2022server.entity.Customer;
import com.c4c._2022server.entity.LoginUser;
import com.c4c._2022server.form.LoginReq;
import com.c4c._2022server.form.LoginRes;
import com.c4c._2022server.mapper.CustomerMapper;
import com.c4c._2022server.service.CustomerAuthorizationService;
import com.c4c._2022server.utils.CookieUtils;
import com.c4c._2022server.utils.JWTUtils;

@Service
public class CustomerAuthorizationServiceImpl implements CustomerAuthorizationService {
    @Autowired
    MessageSource messageSource;
    @Autowired
    CustomerMapper customerMapper;

    /**
     * ログイン
     * @param reqForm
     * @return loginRes
     */
    @Override
    public LoginRes signIn(LoginReq reqForm, HttpServletResponse response) throws AuthenticationException {
        String jwt = null;
        // メールアドレスをキーにユーザーを取得
        Customer customer = customerMapper.select0001(reqForm.getEmail());
        if (customer == null) {
            throw new AuthenticationException(messageSource.getMessage("error.email.not.registered", new String[]{}, Locale.getDefault()));
        }
        // 入力されたパスワードとDBのパスワード(ハッシュ化済み)を比較
        BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
        if (!bcpe.matches(reqForm.getPassword(), customer.getPassword())) {
            throw new AuthenticationException(messageSource.getMessage("error.password.not.match", new String[]{}, Locale.getDefault()));
        }
        // JWTを生成&検証
        LoginUser loginuser = new LoginUser(customer.getCustomerId(), customer.getStoreId(), AuthenticationType.CUSTOMER.getCode());
        JWTUtils instance = JWTUtils.getInstance();
        jwt = instance.createJWT(loginuser);
        // Cookieを設定
        CookieUtils.setCookie(response, "jwt", jwt);

        // レスポンスを作成
        LoginRes loginRes = new LoginRes();
        loginRes.setId(customer.getCustomerId());
        loginRes.setJwt(jwt);
        loginRes.setAuthenticationType(AuthenticationType.CUSTOMER.getCode());
        return loginRes;
    }

    /**
     * ログアウト
     * @param request, response
     */
    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        CookieUtils.deleteCookie(request, response, "jwt");
    }
}
