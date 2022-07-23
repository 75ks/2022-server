package com.c4c._2022server.config;

import java.util.Locale;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.c4c._2022server.utils.CookieUtils;
import com.c4c._2022server.utils.JWTUtils;

@Component
public class HandlerInterceptorImpl implements HandlerInterceptor {
    @Autowired
    MessageSource messageSource;

    /**
     * コントローラーの実行前の共通処理
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // Cookieに保存されているJWTを取得する
        String jwt = CookieUtils.getCookie(request, "jwt");
        // JWTを検証
        if (JWTUtils.verifyJWT(jwt)) {
            // コントローラーを実行する
            return true;
        } else {
            throw new AuthenticationException(messageSource.getMessage("error.authentication", new String[]{}, Locale.getDefault()));
        }
    }
}
