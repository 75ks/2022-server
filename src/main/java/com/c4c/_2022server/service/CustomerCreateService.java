package com.c4c._2022server.service;

import com.c4c._2022server.form.CustomerCreateReq;

public interface CustomerCreateService {
    /**
     * 顧客登録
     * @param reqForm
     */
    public void register(CustomerCreateReq reqForm);
}
