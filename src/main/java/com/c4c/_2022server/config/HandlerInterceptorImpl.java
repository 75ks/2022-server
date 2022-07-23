package com.c4c._2022server.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.c4c._2022server.utils.CookieUtils;
import com.c4c._2022server.utils.JWTUtils;

@Component
public class HandlerInterceptorImpl implements HandlerInterceptor {
    /**
     * コントローラーの実行前の共通処理
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // Cookieに保存されているJWTを取得する
        String jwt = CookieUtils.getCookie(request, "jwt");
        // JWTを検証
        if (JWTUtils.verifyJWT(jwt)) {
            // true:コントローラーを実行する
            return true;
        } else {
            // false:コントローラーの処理を実行せずに200のレスポンスを返す
            return false;
        }
    }
}
