package com.c4c._2022server.service;


import com.c4c._2022server.exception.DuplicationException;
import com.c4c._2022server.exception.ExclusiveException;
import com.c4c._2022server.form.customer.CustomerProfileInitRes;
import com.c4c._2022server.form.customer.CustomerProfileUpdateReq;

public interface CustomerProfileService {
    /**
     * 顧客情報取得
     */


    CustomerProfileInitRes index(int customerId);

    void update(int customerId, CustomerProfileUpdateReq reqForm) throws ExclusiveException, DuplicationException;

}
