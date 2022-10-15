package com.c4c._2022server.controller;


import java.util.Locale;

import javax.security.sasl.AuthenticationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.c4c._2022server.form.CustomerListFormRes;
import com.c4c._2022server.form.ReserveHistoryUpdateReq;
import com.c4c._2022server.service.impl.CustomerProfileServiceImpl;
import com.c4c._2022server.utils.JWTUtils;
import com.c4c._2022server.form.CustomerListFormReq;

@RestController
@RequestMapping("/customer/profile")
public class CustomerProfileController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    CustomerProfileServiceImpl CustomerProfileServiceImpl;

    /**
     * 顧客情報取得
     * @return List{@literal<CustomerListFormRes>}
     */
    @GetMapping("/initialize")
    public ResponseEntity<CustomerListFormRes> index(@RequestHeader("CustomerAuthorization") String jwt) throws AuthenticationException {
    	JWTUtils instance = JWTUtils.getInstance();
    	Integer customerId = instance.getId(jwt);
    	CustomerListFormRes resForm = CustomerProfileServiceImpl.index(customerId);
        return ResponseEntity.ok(resForm);
    }

    /**
     * 顧客情報更新
     * @param jwt
     * @param reqForm
     * @return
     * @throws AuthenticationException
     */
    @PutMapping("/update")
    public ResponseEntity<CustomerListFormRes> update(@RequestHeader("CustomerAuthorization") String jwt, @RequestBody @Valid CustomerListFormReq reqForm) throws AuthenticationException{
        JWTUtils instance = JWTUtils.getInstance();
        Integer customerId = instance.getId(jwt);
        CustomerProfileServiceImpl.update(customerId, reqForm);
        CustomerListFormRes resForm = new CustomerListFormRes();
        // ReserveHistoryControllerクラスのupdateの処理を参考にしたが、
        // やっていることが分からないのでいったんコメントアウト
        // resForm.setMessages(messageSource.getMessage("success", new String[]{"更新"}, Locale.getDefault()));
        CustomerListFormRes resForm2 = CustomerProfileServiceImpl.index(customerId);
        return ResponseEntity.ok(resForm2);
    }

}
