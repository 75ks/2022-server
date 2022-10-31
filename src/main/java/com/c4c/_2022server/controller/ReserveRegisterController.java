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

import com.c4c._2022server.form.ReserveRegisterReq;
import com.c4c._2022server.form.ReserveRegisterRes;
import com.c4c._2022server.service.impl.ReserveRegisterServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/reserveRegister")
public class ReserveRegisterController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    ReserveRegisterServiceImpl reserveRegisterServiceImpl;

    /**
     * ランクID取得
     * @param jwt トークン
     * @param stuffId スタッフID
     * @return ランクID
     * @throws AuthenticationException
     */
    @GetMapping("/")
    public ResponseEntity<Integer> getRankId(@RequestHeader("CustomerAuthorization") String jwt, @RequestParam(name = "stuffId", required = true) Integer stuffId) throws AuthenticationException {
        Integer rankId = reserveRegisterServiceImpl.getRankId(stuffId);
        return ResponseEntity.ok(rankId);
    }

    /**
     * 予約情報登録
     * @param jwt トークン
     * @param reqForm 画面からの入力値
     * @return 成功メッセージ
     * @throws AuthenticationException
     */
    @PostMapping("/")
    public ResponseEntity<ReserveRegisterRes> register(@RequestHeader("CustomerAuthorization") String jwt, @RequestBody @Valid ReserveRegisterReq reqForm) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int customerId = instance.getId(jwt);
        int storeId = instance.getStoreId(jwt);
        reserveRegisterServiceImpl.register(customerId, storeId, reqForm);
        // メッセージを設定
        ReserveRegisterRes resForm = new ReserveRegisterRes();
        resForm.setMessages(messageSource.getMessage("success", new String[]{"登録"}, Locale.getDefault()));
        return ResponseEntity.ok(resForm);
    }
}
