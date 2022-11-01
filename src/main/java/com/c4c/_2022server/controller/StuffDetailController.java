package com.c4c._2022server.controller;

import java.util.Locale;

import javax.security.sasl.AuthenticationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.exception.DuplicationException;
import com.c4c._2022server.form.StuffDetailRegisterReq;
import com.c4c._2022server.form.StuffDetailRegisterRes;
import com.c4c._2022server.form.StuffDetailRes;
import com.c4c._2022server.service.impl.StuffDetailServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/stuffDetail")
public class StuffDetailController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    StuffDetailServiceImpl stuffDetailServiceImpl;

    /**
     * 初期表示
     * @param jwt トークン
     * @param givenStuffId スタッフID
     * @return スタッフ詳細情報
     * @throws AuthenticationException
     */
    @GetMapping("/initialize")
    public ResponseEntity<StuffDetailRes> initialize(@RequestHeader("Authorization") String jwt, @RequestParam(name = "stuffId", required = true) Integer givenStuffId) throws AuthenticationException {
        // JWTから店舗IDを取得する
        JWTUtils instance = JWTUtils.getInstance();
        Integer storeId = instance.getStoreId(jwt);
        // レスポンスForm
        StuffDetailRes resForm = stuffDetailServiceImpl.initialize(storeId, givenStuffId);
        return ResponseEntity.ok(resForm);
    }
    
    /**
     * スタッフ情報更新
     * @param jwt トークン
     * @param reqForm  画面からの入力値
     * @return 成功メッセージ
     * @throws AuthenticationException
     * @throws DuplicationException
     */
    @PostMapping("/")
    public ResponseEntity<StuffDetailRegisterRes> register(@RequestHeader("Authorization") String jwt, @RequestBody @Valid StuffDetailRegisterReq reqForm) throws AuthenticationException, DuplicationException {
        JWTUtils instance = JWTUtils.getInstance();
        int stuffId = instance.getId(jwt);
        int storeId = instance.getStoreId(jwt);
        stuffDetailServiceImpl.register(stuffId, storeId, reqForm);
        // メッセージを設定
        StuffDetailRegisterRes resForm = new StuffDetailRegisterRes();
        resForm.setMessages(messageSource.getMessage("success", new String[]{"更新"}, Locale.getDefault()));
        return ResponseEntity.ok(resForm);
    }
}
