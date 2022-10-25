package com.c4c._2022server.controller;

import java.util.List;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.CustomerListFormReq;
import com.c4c._2022server.form.CustomerListFormRes;
import com.c4c._2022server.service.impl.CustomerListServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/customers")
public class CustomerListController {
    @Autowired
    CustomerListServiceImpl customerListServiceImpl;

    /**
     * 顧客一覧取得
     * @param jwt トークン
     * @param reqForm 画面からの入力値
     * @return 顧客情報一覧
     * @throws AuthenticationException
     */
    @GetMapping("/")
    public ResponseEntity<List<CustomerListFormRes>> index(@RequestHeader("Authorization") String jwt, CustomerListFormReq reqForm) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int storeId = instance.getStoreId(jwt);
        List<CustomerListFormRes> customerFormList = customerListServiceImpl.index(storeId, reqForm);
        return ResponseEntity.ok(customerFormList);
    }
}
