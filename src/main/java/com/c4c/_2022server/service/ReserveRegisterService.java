package com.c4c._2022server.service;

import com.c4c._2022server.form.ReserveRegisterReq;

public interface ReserveRegisterService {
    /**
     * ランクID取得
     * @param stuffId
     */
    public Integer getRankId(Integer stuffId);
    
    /**
     * 予約情報登録
     * @param customerId
     * @param storeId
     * @param reqForm
     */
    public void register(int customerId, int storeId, ReserveRegisterReq reqForm);
}
