package com.c4c._2022server.service;

import java.util.List;

import com.c4c._2022server.form.CustomerListFormReq;
import com.c4c._2022server.form.CustomerListFormRes;

public interface CustomerListService {
    /**
     * 顧客一覧取得
     * @param storeId
     * @param reqForm
     * @return List{@literal<CustomerListRes>}
     */
    List<CustomerListFormRes> index(int storeId, CustomerListFormReq reqForm);
}
