package com.c4c._2022server.service;

import com.c4c._2022server.form.RegisterSampleReq;

public interface RegisterSampleService {
    /**
     * スタッフ登録サンプル
     * @param reqForm
     */
    public void register(RegisterSampleReq reqForm);
}
