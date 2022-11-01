package com.c4c._2022server.service;

import com.c4c._2022server.exception.DuplicationException;
import com.c4c._2022server.form.StuffDetailRegisterReq;
import com.c4c._2022server.form.StuffDetailRes;

public interface StuffDetailService {
    /**
     * 初期表示
     * @param storeId 店舗ID
     * @param stuffId スタッフID
     * @return スタッフ詳細情報
     */
    public StuffDetailRes initialize(int storeId, int stuffId);

    /**
     * スタッフ情報更新
     * @param stuffId スタッフID
     * @param storeId 店舗ID
     * @param reqForm 画面からの入力値
     * @throws DuplicationException
     */
    public void register(int stuffId, int storeId, StuffDetailRegisterReq reqForm) throws DuplicationException;
}
