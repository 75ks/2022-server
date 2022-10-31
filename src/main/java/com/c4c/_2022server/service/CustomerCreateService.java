package com.c4c._2022server.service;

import com.c4c._2022server.exception.DuplicationException;
import com.c4c._2022server.form.CustomerCreateReq;

public interface CustomerCreateService {
    /**
     * 顧客登録
     * @param storeId 店舗ID
     * @param stuffId スタッフID
     * @param reqForm 画面からの入力値
     * @throws DuplicationException
     */
    public void register(int storeId, int stuffId, CustomerCreateReq reqForm) throws DuplicationException;
}
