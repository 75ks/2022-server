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
     * 新規会員登録
     * @param 
     * @return List{@literal<String>}
     */
    @PostMapping("/signUp")
    public ResponseEntity<String> signUp() {
        return null;
    }

    /**
     * ログイン
     * @param LoginReq
     * @return LoginRes
     */
    @PostMapping("/login")
    public ResponseEntity<LoginRes> login(HttpServletResponse response, @RequestBody LoginReq reqForm) throws AuthenticationException {
        LoginRes resForm = authorizationServiceImpl.signIn(reqForm, response);
        return ResponseEntity.ok(resForm);
    }
    
    /**
     * ログアウト
     * @param request, response
     */
    @GetMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        authorizationServiceImpl.logout(request, response);
    }
}
