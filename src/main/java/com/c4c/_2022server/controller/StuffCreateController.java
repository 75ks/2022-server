package com.c4c._2022server.controller;

import java.util.Locale;

import javax.security.sasl.AuthenticationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.exception.DuplicationException;
import com.c4c._2022server.form.StuffCreateReq;
import com.c4c._2022server.form.StuffCreateRes;
import com.c4c._2022server.service.impl.StuffCreateServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/stuffCreate")
public class StuffCreateController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    StuffCreateServiceImpl stuffCreateServiceImpl;

    /**
     * スタッフ登録
     * @param jwt
     * @param reqForm
     * @return StuffCreateRes
     * @throws AuthenticationException
     * @throws DuplicationException
     */
    @PostMapping("")
    public ResponseEntity<StuffCreateRes> register(@RequestHeader("Authorization") String jwt, @RequestBody @Valid StuffCreateReq reqForm) throws AuthenticationException, DuplicationException {
        // JWTから店舗IDを取得する
        JWTUtils instance = JWTUtils.getInstance();
        Integer storeId = instance.getStoreId(jwt);
        Integer stuffId = instance.getId(jwt);

        stuffCreateServiceImpl.register(storeId, stuffId, reqForm);
        // メッセージを設定
        StuffCreateRes resForm = new StuffCreateRes();
        resForm.setMessages(messageSource.getMessage("success", new String[]{"登録"}, Locale.getDefault()));
        return ResponseEntity.ok(resForm);
    }
}
