package com.c4c._2022server.service;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.c4c._2022server.form.LoginReq;
import com.c4c._2022server.form.LoginRes;
import com.c4c._2022server.form.RegisterPasswordReq;

public interface CustomerAuthorizationService {
    /**
     * ログイン
     * @param reqForm 画面からの入力値
     * @param response レスポンス
     * @return ログイン情報
     * @throws AuthenticationException
     */
    public LoginRes signIn(LoginReq reqForm, HttpServletResponse response) throws AuthenticationException;

    /**
     * ログアウト
     * @param request リクエスト
     * @param response レスポンス
     */
    public void logout(HttpServletRequest request, HttpServletResponse response);

    /**
     * パスワード登録
     * @param customerId 顧客ID
     * @param reqForm 画面からの入力値
     */
    public void registerPassword(int customerId, RegisterPasswordReq reqForm);
}
