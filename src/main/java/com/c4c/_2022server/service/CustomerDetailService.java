package com.c4c._2022server.service;

import com.c4c._2022server.exception.ExclusiveException;
import com.c4c._2022server.form.CustomerDetailRegisterReq;
import com.c4c._2022server.form.CustomerDetailRes;

public interface CustomerDetailService {
	/**
	 * 初期表示
	 * @param storeId
	 * @param customerId
	 * @return
	 */
    public CustomerDetailRes index(int storeId, int customerId);

    /**
     * 顧客情報更新
     * @param storeId
     * @param customerId
     * @param reqForm
     * @throws ExclusiveException
     */
    public void register(int storeId, int customerId, CustomerDetailRegisterReq reqForm) throws ExclusiveException;
}