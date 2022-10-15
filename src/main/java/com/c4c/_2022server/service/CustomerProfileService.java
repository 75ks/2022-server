package com.c4c._2022server.service;


import com.c4c._2022server.form.customer.CustomerProfileUpdateReq;
import com.c4c._2022server.form.customer.CustomerProfileInitRes;

public interface CustomerProfileService {
    /**
     * 顧客情報取得
     */


    CustomerProfileInitRes index(int customerId);

    void update(int customerId, CustomerProfileUpdateReq reqForm);

}
