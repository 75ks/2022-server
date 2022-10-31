package com.c4c._2022server.service;

import com.c4c._2022server.form.ReserveRegisterReq;

public interface ReserveRegisterService {
    /**
     * ランクID取得
     * @param stuffId スタッフID
     * @return ランクID
     */
    public Integer getRankId(Integer stuffId);

    /**
     * 予約情報登録
     * @param customerId 顧客ID
     * @param storeId 店舗ID
     * @param reqForm 画面からの入力値
     */
    public void register(int customerId, int storeId, ReserveRegisterReq reqForm);
}
