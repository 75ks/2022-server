package com.c4c._2022server.service;

import com.c4c._2022server.form.StuffCreateReq;

public interface StuffCreateService {
    /**
     * スタッフ登録
     * @param storeId
     * @param stuffId
     * @param reqForm
     */
    public void register(int storeId, int stuffId, StuffCreateReq reqForm) throws Exception;
}
