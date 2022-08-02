package com.c4c._2022server.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.CustomerCreateReq;
import com.c4c._2022server.form.CustomerCreateRes;
import com.c4c._2022server.service.impl.CustomerCreateServiceImpl;

@RestController
@RequestMapping("/customerCreate")
public class CustomerCreateController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    CustomerCreateServiceImpl customerCreateServiceImpl;

    /**
     * 顧客登録
     * @param reqForm
     */
    @PostMapping("")
    public ResponseEntity<CustomerCreateRes> register(@RequestBody @Valid CustomerCreateReq reqForm) {
    	customerCreateServiceImpl.register(reqForm);
        // メッセージを設定
    	CustomerCreateRes resForm = new CustomerCreateRes();
        resForm.setMessages(messageSource.getMessage("success", new String[]{"登録"}, Locale.getDefault()));
        return ResponseEntity.ok(resForm);
    	
//    	System.out.println(reqForm);
//    	
//    	String test = reqForm.getEmail(); 
//    	
//    	System.out.println(test);
//    	
//        return null;
    }
}