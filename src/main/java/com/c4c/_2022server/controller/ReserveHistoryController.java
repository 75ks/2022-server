package com.c4c._2022server.controller;

import java.util.List;
import java.util.Locale;

import javax.security.sasl.AuthenticationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.ReserveHistoryRegisterReq;
import com.c4c._2022server.form.ReserveHistoryRegisterRes;
import com.c4c._2022server.form.ReserveHistoryReq;
import com.c4c._2022server.form.ReserveHistoryRes;
import com.c4c._2022server.form.ReserveHistoryUpdateReq;
import com.c4c._2022server.service.impl.ReserveHistoryServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/reserves")
public class ReserveHistoryController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    ReserveHistoryServiceImpl reserveHistoryServiceImpl;

    /**
     * 予約履歴一覧取得
     * @param jwt トークン
     * @param reqForm 画面からの入力値
     * @return 予約履歴一覧
     * @throws AuthenticationException
     */
    @GetMapping("/")
    public ResponseEntity<List<ReserveHistoryRes>> index(@RequestHeader("Authorization") String jwt, ReserveHistoryReq reqForm) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int storeId = instance.getStoreId(jwt);
        List<ReserveHistoryRes> resFormList = reserveHistoryServiceImpl.index(storeId, reqForm);
        return ResponseEntity.ok(resFormList);
    }

    /**
     * 予約情報登録
     * @param jwt トークン
     * @param reqForm 画面からの入力値
     * @return 成功メッセージ
     * @throws AuthenticationException
     */
    @PostMapping("/register")
    public ResponseEntity<ReserveHistoryRegisterRes> register(@RequestHeader("Authorization") String jwt, @RequestBody @Valid ReserveHistoryRegisterReq reqForm) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int stuffId = instance.getId(jwt);
        int storeId = instance.getStoreId(jwt);
        reserveHistoryServiceImpl.register(stuffId, storeId, reqForm);
        // メッセージを設定
        ReserveHistoryRegisterRes resForm = new ReserveHistoryRegisterRes();
        resForm.setMessages(messageSource.getMessage("success", new String[]{"登録"}, Locale.getDefault()));
        return ResponseEntity.ok(resForm);
    }

    /**
     * 予約情報更新
     * @param jwt トークン
     * @param reqForm 画面からの入力値
     * @return 成功メッセージ
     * @throws AuthenticationException
     */
    @PutMapping("/update")
    public ResponseEntity<ReserveHistoryRegisterRes> update(@RequestHeader("Authorization") String jwt, @RequestBody @Valid ReserveHistoryUpdateReq reqForm) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int stuffId = instance.getId(jwt);
        int storeId = instance.getStoreId(jwt);
        reserveHistoryServiceImpl.update(stuffId, storeId, reqForm);
        // メッセージを設定
        ReserveHistoryRegisterRes resForm = new ReserveHistoryRegisterRes();
        resForm.setMessages(messageSource.getMessage("success", new String[]{"更新"}, Locale.getDefault()));
        return ResponseEntity.ok(resForm);
    }

    /**
     * 予約情報削除
     * @param jwt トークン
     * @param reqForm 画面からの入力値
     * @return 成功メッセージ
     * @throws AuthenticationException
     */
    @PutMapping("/delete")
    public ResponseEntity<ReserveHistoryRegisterRes> delete(@RequestHeader("Authorization") String jwt, @RequestBody @Valid ReserveHistoryUpdateReq reqForm) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int stuffId = instance.getId(jwt);
        reserveHistoryServiceImpl.delete(stuffId, reqForm);
        // メッセージを設定
        ReserveHistoryRegisterRes resForm = new ReserveHistoryRegisterRes();
        resForm.setMessages(messageSource.getMessage("success", new String[]{"削除"}, Locale.getDefault()));
        return ResponseEntity.ok(resForm);
    }
}
