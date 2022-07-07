package com.c4c._2022server.service;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.c4c._2022server.form.LoginReq;
import com.c4c._2022server.form.LoginRes;

public interface AuthorizationService {
    /**
     * ログイン
     * @param SignInReq
     */
    public LoginRes signIn(LoginReq reqForm, HttpServletResponse response) throws AuthenticationException;

    /**
     * ログアウト
     * @param response
     */
    public void logout(HttpServletRequest request, HttpServletResponse response);
}
