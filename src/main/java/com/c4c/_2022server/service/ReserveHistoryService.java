package com.c4c._2022server.service;

import java.util.List;

import com.c4c._2022server.form.ReserveHistoryRegisterReq;
import com.c4c._2022server.form.ReserveHistoryReq;
import com.c4c._2022server.form.ReserveHistoryRes;

public interface ReserveHistoryService {
    /**
     * 予約履歴一覧取得
     * @param stuffId
     * @param reqForm
     */
    public List<ReserveHistoryRes> index(int stuffId, ReserveHistoryReq reqForm);

    /**
     * 予約情報登録
     * @param stuffId
     * @param storeId
     * @param reqForm
     */
    public void register(int stuffId, int storeId, ReserveHistoryRegisterReq reqForm);
}
