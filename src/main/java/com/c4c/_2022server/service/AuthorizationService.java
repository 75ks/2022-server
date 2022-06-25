package com.c4c._2022server.service;

import javax.servlet.http.HttpServletResponse;

import com.c4c._2022server.form.LoginReq;
import com.c4c._2022server.form.LoginRes;

public interface AuthorizationService {
    /**
     * ログイン
     * @param SignInReq
     */
    public LoginRes signIn(LoginReq reqForm, HttpServletResponse response);
}
