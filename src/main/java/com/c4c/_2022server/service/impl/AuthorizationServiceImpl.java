package com.c4c._2022server.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

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
    StuffMapper stuffMapper;

    /**
     * ログイン
     * @param reqForm
     * @return stuffId
     */
    @Override
    public LoginRes signIn(LoginReq reqForm, HttpServletResponse response) {
        Integer stuffId = null;
        String jwt = null;
        // メールアドレスをキーにユーザーを取得
        Stuff stuff = stuffMapper.select0001(reqForm.getEmail());
        // ユーザーが存在する場合
        if (stuff != null) {
            // 入力されたパスワードとDBのパスワード(ハッシュ化済み)を比較
            BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
            if (bcpe.matches(reqForm.getPassword(), stuff.getPassword())) {
                stuffId = stuff.getStuffId();
            }
        }
        // パスワードが一致した場合
        if (stuffId != null) {
            // JWTを生成&検証
            jwt = JWTUtils.createJWT(stuffId);
            // Cookieを設定
            CookieUtils.setCookie(response, "jwt", jwt);
        }
        // レスポンスを作成
        LoginRes loginRes = new LoginRes();
        loginRes.setStuffId(stuffId);
        loginRes.setJwt(jwt);
        return loginRes;
    }
}
