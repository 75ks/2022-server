package com.c4c._2022server.service;

import com.c4c._2022server.form.StuffDetailRegisterReq;
import com.c4c._2022server.form.StuffDetailRes;

public interface StuffDetailService {
    /**
     * スタッフ詳細表示
     * @param storeId
     * @param stuffId
     */
	public StuffDetailRes initialize(int storeId, int stuffId);
	
    /**
     * スタッフ情報更新
     * @param stuffId
     * @param storeId
     * @param reqForm
     */
    public void register(int stuffId, int storeId, StuffDetailRegisterReq reqForm);
}
