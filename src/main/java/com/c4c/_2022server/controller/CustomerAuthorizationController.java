package com.c4c._2022server.controller;

import java.util.Locale;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.LoginReq;
import com.c4c._2022server.form.LoginRes;
import com.c4c._2022server.form.RegisterPasswordReq;
import com.c4c._2022server.form.RegisterPasswordRes;
import com.c4c._2022server.service.impl.CustomerAuthorizationServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/customerAuthorization")
public class CustomerAuthorizationController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    CustomerAuthorizationServiceImpl customerAuthorizationServiceImpl;

    /**
     * ログイン
     * @param response レスポンス
     * @param reqForm 画面からの入力値
     * @return ログイン情報
     * @throws AuthenticationException
     */
    @PostMapping("/login")
    public ResponseEntity<LoginRes> login(HttpServletResponse response, @RequestBody LoginReq reqForm) throws AuthenticationException {
        LoginRes resForm = customerAuthorizationServiceImpl.signIn(reqForm, response);
        return ResponseEntity.ok(resForm);
    }

    /**
     * ログアウト
     * @param request リクエスト
     * @param response レスポンス
     */
    @GetMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        customerAuthorizationServiceImpl.logout(request, response);
    }

    /**
     * パスワード登録
     * @param jwt トークン
     * @param reqForm 画面からの入力値
     * @return 成功メッセージ
     * @throws AuthenticationException
     */
    @PostMapping("/registerPassword")
    public ResponseEntity<RegisterPasswordRes> registerPassword(@RequestHeader("CustomerAuthorization") String jwt, @RequestBody @Valid RegisterPasswordReq reqForm) throws AuthenticationException {
        // JWTから顧客IDを取得する
        JWTUtils instance = JWTUtils.getInstance();
        Integer customerId = instance.getId(jwt);

        customerAuthorizationServiceImpl.registerPassword(customerId, reqForm);
        // メッセージを設定
        RegisterPasswordRes resForm = new RegisterPasswordRes();
        resForm.setMessages(messageSource.getMessage("success", new String[]{"登録"}, Locale.getDefault()));
        return ResponseEntity.ok(resForm);
    }
}
