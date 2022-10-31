package com.c4c._2022server.service;

import java.util.List;

import com.c4c._2022server.exception.DuplicationException;
import com.c4c._2022server.exception.ExclusiveException;
import com.c4c._2022server.form.customer.CustomerHomeInitRes;
import com.c4c._2022server.form.customer.CustomerProfileInitRes;
import com.c4c._2022server.form.customer.CustomerProfileUpdateReq;

public interface CustomerHomeService {
    /**
     * 顧客情報取得
     * @param customerId 顧客ID
     * @return 顧客詳細情報
     */
    public List<CustomerHomeInitRes> index(int customerId);

}
