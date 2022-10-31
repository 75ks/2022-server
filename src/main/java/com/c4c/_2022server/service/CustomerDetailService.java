package com.c4c._2022server.service;

import com.c4c._2022server.exception.DuplicationException;
import com.c4c._2022server.exception.ExclusiveException;
import com.c4c._2022server.form.CustomerDetailRegisterReq;
import com.c4c._2022server.form.CustomerDetailRes;

public interface CustomerDetailService {
    /**
     * 初期表示
     * @param storeId 店舗ID
     * @param customerId 顧客ID
     * @return 顧客詳細情報
     */
    public CustomerDetailRes index(int storeId, int customerId);

    /**
     * 顧客情報更新
     * @param storeid 店舗ID
     * @param stuffId スタッフID
     * @param reqForm 画面からの入力値
     * @throws ExclusiveException
     * @throws DuplicationException
     */
    public void register(int storeId, CustomerDetailRegisterReq reqForm) throws ExclusiveException, DuplicationException;
}