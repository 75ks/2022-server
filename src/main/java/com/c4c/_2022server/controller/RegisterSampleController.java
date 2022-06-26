package com.c4c._2022server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.RegisterSampleReq;
import com.c4c._2022server.service.impl.RegisterSampleServiceImpl;

@RestController
@RequestMapping("/sample")
public class RegisterSampleController {
    @Autowired
    RegisterSampleServiceImpl registerSampleServiceImpl;
    /**
     * スタッフ登録サンプル
     * @param reqForm
     */
    @PostMapping("/")
    public void register(@RequestBody RegisterSampleReq reqForm) {
        registerSampleServiceImpl.register(reqForm);
    }
}
