package com.c4c._2022server.service;

import com.c4c._2022server.exception.DuplicationException;
import com.c4c._2022server.exception.ExclusiveException;
import com.c4c._2022server.form.customer.CustomerProfileInitRes;
import com.c4c._2022server.form.customer.CustomerProfileUpdateReq;

public interface CustomerProfileService {
    /**
     * 顧客情報取得
     * @param customerId 顧客ID
     * @return 顧客詳細情報
     */
    public CustomerProfileInitRes index(int customerId);

    /**
     * 顧客情報更新
     * @param customerId 顧客ID
     * @param reqForm 画面からの入力値
     * @throws ExclusiveException
     * @throws DuplicationException
     */
    public void update(int customerId, CustomerProfileUpdateReq reqForm) throws ExclusiveException, DuplicationException;
}
