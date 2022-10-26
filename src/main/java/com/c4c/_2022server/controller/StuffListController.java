package com.c4c._2022server.controller;

import java.util.List;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.StuffListFormReq;
import com.c4c._2022server.form.StuffListFormRes;
import com.c4c._2022server.service.impl.StuffListServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/stuffs")
public class StuffListController {
    @Autowired
    StuffListServiceImpl stuffListServiceImpl;

    /**
     * スタッフ一覧取得
     * @param jwt トークン
     * @param reqForm 画面からの入力値
     * @return スタッフ一覧
     * @throws AuthenticationException
     */
    @GetMapping("/")
    public ResponseEntity<List<StuffListFormRes>> index(@RequestHeader("Authorization") String jwt, StuffListFormReq reqForm) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int storeId = instance.getStoreId(jwt);
        List<StuffListFormRes> stuffFormList = stuffListServiceImpl.index(storeId, reqForm);
        return ResponseEntity.ok(stuffFormList);
    }
}
