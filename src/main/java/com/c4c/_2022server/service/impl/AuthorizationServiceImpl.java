package com.c4c._2022server.service.impl;

import java.util.List;
import java.util.Locale;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.c4c._2022server.entity.StuffExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.c4c._2022server.enums.AuthenticationTypeEnum;
import com.c4c._2022server.entity.LoginUser;
import com.c4c._2022server.entity.Stuff;
import com.c4c._2022server.form.LoginReq;
import com.c4c._2022server.form.LoginRes;
import com.c4c._2022server.mapper.StuffMapper;
import com.c4c._2022server.service.AuthorizationService;
import com.c4c._2022server.utils.CookieUtils;
import com.c4c._2022server.utils.JWTUtils;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {
    @Autowired
    MessageSource messageSource;
    @Autowired
    StuffMapper stuffMapper;

    /**
     * ログイン
     * @param reqForm
     * @param response
     * @return loginRes
     * @throws AuthenticationException
     */
    @Override
    public LoginRes signIn(LoginReq reqForm, HttpServletResponse response) throws AuthenticationException {
        String jwt;
        // メールアドレスをキーにユーザーを取得
        StuffExample stuffExample = new StuffExample();
        stuffExample.createCriteria().andEmailEqualTo(reqForm.getEmail());
        List<Stuff> stuffList = stuffMapper.selectByExample(stuffExample);

        if (stuffList.isEmpty()) {
            throw new AuthenticationException(messageSource.getMessage("error.email.not.registered", new String[]{}, Locale.getDefault()));
        }
        Stuff stuff = stuffList.get(0);
                // 入力されたパスワードとDBのパスワード(ハッシュ化済み)を比較
        BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
        if (!bcpe.matches(reqForm.getPassword(), stuff.getPassword())) {
            throw new AuthenticationException(messageSource.getMessage("error.password.not.match", new String[]{}, Locale.getDefault()));
        }
        // JWTを生成&検証
        LoginUser loginuser = new LoginUser(stuff.getStuffId(), stuff.getStoreId(), AuthenticationTypeEnum.STUFF.getCode());
        JWTUtils instance = JWTUtils.getInstance();
        jwt = instance.createJWT(loginuser);
        // Cookieを設定
        CookieUtils.setCookie(response, "jwt", jwt);

        // レスポンスを作成
        LoginRes loginRes = new LoginRes();
        loginRes.setId(stuff.getStuffId());
        loginRes.setJwt(jwt);
        loginRes.setAuthenticationType(AuthenticationTypeEnum.STUFF.getCode());
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
