package com.c4c._2022server.service;

import java.util.List;

import com.c4c._2022server.form.ReserveHistoryRegisterReq;
import com.c4c._2022server.form.ReserveHistoryReq;
import com.c4c._2022server.form.ReserveHistoryRes;
import com.c4c._2022server.form.ReserveHistoryUpdateReq;

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

    /**
     * 予約情報更新
     * @param stuffId
     * @param storeId
     * @param reqForm
     */
    public void update(int stuffId, int storeId, ReserveHistoryUpdateReq reqForm);

    /**
     * 予約情報削除
     * @param stuffId
     * @param reqForm
     */
    public void delete(int stuffId, ReserveHistoryUpdateReq reqForm);
}
