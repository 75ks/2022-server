package com.c4c._2022server.service;

import com.c4c._2022server.form.CustomerListFormRes;

public interface CustomerProfileService {
    /**
     * スタッフ一覧取得
     */
    CustomerListFormRes index(int customerId);
}
