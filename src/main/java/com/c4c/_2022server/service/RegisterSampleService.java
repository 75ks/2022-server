package com.c4c._2022server.service;

import com.c4c._2022server.form.RegisterSampleReq;

public interface RegisterSampleService {
    /**
     * スタッフ登録サンプル
     * @param reqForm 画面からの入力値
     */
    public void register(RegisterSampleReq reqForm);
}
