package com.c4c._2022server.service;

import com.c4c._2022server.form.CustomerDetailReq;

public interface CustomerDetailService {
    /**
     * 顧客登録
     * @param storeId
     * @param stuffId
     * @param reqForm
     */
    public void register(int storeId, int stuffId, CustomerDetailReq reqForm);
}
