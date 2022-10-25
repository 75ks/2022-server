package com.c4c._2022server.service;

import com.c4c._2022server.exception.DuplicationException;
import com.c4c._2022server.form.CustomerDetailRegisterReq;
import com.c4c._2022server.form.CustomerDetailRes;

public interface CustomerDetailService {
    /**
     * 初期表示
     * @param storeId
     * @param customerId
     * @return CustomerDetailRes
     */
    public CustomerDetailRes index(int storeId, int customerId);

    /**
     * 顧客情報更新
     * @param stuffId
     * @param storeId
     * @param reqForm
     * @throws DuplicationException
     */
    public void register(int stuffId, int storeId, CustomerDetailRegisterReq reqForm) throws DuplicationException;
}