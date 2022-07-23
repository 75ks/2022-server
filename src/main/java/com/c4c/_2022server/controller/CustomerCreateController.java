package com.c4c._2022server.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.CustomerCreateReq;

@RestController
@RequestMapping("/customerCreate")
public class CustomerCreateController {
    @Autowired
    MessageSource messageSource;

    /**
     * 顧客登録
     * @param reqForm
     */
    @PostMapping("")
    public ResponseEntity<?> register(@RequestBody @Valid CustomerCreateReq reqForm) {
        
    	System.out.println(reqForm);
    	
    	String test = reqForm.getTest(); 
    	
    	System.out.println(test);
    	
        return null;
    }
}