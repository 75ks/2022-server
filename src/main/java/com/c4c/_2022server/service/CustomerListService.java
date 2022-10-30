package com.c4c._2022server.service;

import java.util.List;

import com.c4c._2022server.form.CustomerListFormReq;
import com.c4c._2022server.form.CustomerListFormRes;

public interface CustomerListService {
    /**
     * 顧客一覧取得
     * @param storeId 店舗ID
     * @param reqForm 画面からの入力値
     * @return 顧客情報一覧
     */
    List<CustomerListFormRes> index(int storeId, CustomerListFormReq reqForm);
}
