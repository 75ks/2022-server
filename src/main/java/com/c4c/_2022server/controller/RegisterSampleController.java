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

import com.c4c._2022server.form.RegisterSampleReq;
import com.c4c._2022server.form.RegisterSampleRes;
import com.c4c._2022server.service.impl.RegisterSampleServiceImpl;

@RestController
@RequestMapping("/sample")
public class RegisterSampleController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    RegisterSampleServiceImpl registerSampleServiceImpl;

    /**
     * スタッフ登録サンプル
     * @param reqForm
     */
    @PostMapping("/")
    public ResponseEntity<RegisterSampleRes> register(@RequestBody @Valid RegisterSampleReq reqForm) {
        registerSampleServiceImpl.register(reqForm);
        // メッセージを設定
        RegisterSampleRes resForm = new RegisterSampleRes();
        resForm.setMessages(messageSource.getMessage("SUCCESS", new String[]{"登録"}, Locale.getDefault()));
        return ResponseEntity.ok(resForm);
    }
}
