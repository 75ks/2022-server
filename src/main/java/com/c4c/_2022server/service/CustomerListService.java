package com.c4c._2022server.service;

import java.util.List;

import com.c4c._2022server.form.CustomerListFormReq;
import com.c4c._2022server.form.CustomerListFormRes;

public interface CustomerListService {
    /**
     * スタッフ一覧取得
     */
    List<CustomerListFormRes> index(int customerId, CustomerListFormReq reqForm);
}
