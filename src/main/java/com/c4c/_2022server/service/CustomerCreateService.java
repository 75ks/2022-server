package com.c4c._2022server.service;

import com.c4c._2022server.form.CustomerCreateReq;

public interface CustomerCreateService {
    /**
     * 顧客登録
     * @param storeId
     * @param stuffId
     * @param reqForm
     */
    public void register(int storeId, int stuffId, CustomerCreateReq reqForm);
}
