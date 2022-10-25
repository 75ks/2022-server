package com.c4c._2022server.controller;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.LoginReq;
import com.c4c._2022server.form.LoginRes;
import com.c4c._2022server.service.impl.AuthorizationServiceImpl;

@RestController
@RequestMapping("/authorization")
public class AuthorizationController {
    @Autowired
    AuthorizationServiceImpl authorizationServiceImpl;

    /**
     * ログイン
     * @param response レスポンス 
     * @param reqForm 画面からの入力値
     * @return ログイン情報
     * @throws AuthenticationException
     */
    @PostMapping("/login")
    public ResponseEntity<LoginRes> login(HttpServletResponse response, @RequestBody LoginReq reqForm) throws AuthenticationException {
        LoginRes resForm = authorizationServiceImpl.signIn(reqForm, response);
        return ResponseEntity.ok(resForm);
    }

    /**
     * ログアウト
     * @param request リクエスト
     * @param response レスポンス
     */
    @GetMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        authorizationServiceImpl.logout(request, response);
    }
}
