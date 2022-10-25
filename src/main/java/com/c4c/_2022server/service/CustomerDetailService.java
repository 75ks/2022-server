package com.c4c._2022server.service;

import com.c4c._2022server.exception.DuplicationException;
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
     * @param stuffId スタッフID
     * @param storeid 店舗ID
     * @param reqForm 画面からの入力値
     * @throws DuplicationException
     */
    public void register(int stuffId, int storeId, CustomerDetailRegisterReq reqForm) throws DuplicationException;
}
