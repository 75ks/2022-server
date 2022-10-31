package com.c4c._2022server.controller;

import java.util.Locale;

import javax.security.sasl.AuthenticationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.exception.DuplicationException;
import com.c4c._2022server.exception.ExclusiveException;
import com.c4c._2022server.form.customer.CustomerProfileInitRes;
import com.c4c._2022server.form.customer.CustomerProfileUpdateReq;
import com.c4c._2022server.form.customer.CustomerProfileUpdateRes;
import com.c4c._2022server.service.impl.CustomerProfileServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/customer/profile")
public class CustomerProfileController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    CustomerProfileServiceImpl CustomerProfileServiceImpl;

    /**
     * 顧客情報取得
     * @param jwt トークン
     * @return 顧客詳細情報
     * @throws AuthenticationException
     */
    @GetMapping("/initialize")
    public ResponseEntity<CustomerProfileInitRes> index(@RequestHeader("CustomerAuthorization") String jwt) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        Integer customerId = instance.getId(jwt);
        CustomerProfileInitRes resForm = CustomerProfileServiceImpl.index(customerId);
        return ResponseEntity.ok(resForm);
    }

    /**
     * 顧客情報更新
     * @param jwt トークン
     * @param reqForm 画面からの入力値
     * @return 成功メッセージ
     * @throws AuthenticationException
     * @throws ExclusiveException
     * @throws DuplicationException
     */
    @PutMapping("/update")
    public ResponseEntity<CustomerProfileUpdateRes> update(@RequestHeader("CustomerAuthorization") String jwt, @RequestBody @Valid CustomerProfileUpdateReq reqForm) throws AuthenticationException, ExclusiveException, DuplicationException {
        JWTUtils instance = JWTUtils.getInstance();
        Integer customerId = instance.getId(jwt);
        CustomerProfileServiceImpl.update(customerId, reqForm);
        CustomerProfileUpdateRes resForm = new CustomerProfileUpdateRes();
        resForm.setMessages(messageSource.getMessage("success", new String[]{"更新"}, Locale.getDefault()));
        return ResponseEntity.ok(resForm);
    }
}
