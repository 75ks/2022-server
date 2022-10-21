package com.c4c._2022server.service;

import com.c4c._2022server.form.CustomerDetailRegisterReq;
import com.c4c._2022server.form.CustomerDetailRes;

public interface CustomerDetailService {
	/**
	 * 
	 * @param storeId
	 * @param customerId
	 * @return
	 */
    public CustomerDetailRes index(int storeId, int customerId);

    /**
     * 顧客情報更新
     * @param stuffId
     * @param storeId
     * @param reqForm
     */
    public void register(int stuffId, int storeId, CustomerDetailRegisterReq reqForm);
}