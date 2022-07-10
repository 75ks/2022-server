package com.c4c._2022server.service;

import java.util.List;

import com.c4c._2022server.form.ReserveHistoryReq;
import com.c4c._2022server.form.ReserveHistoryRes;

public interface ReserveHistoryService {
    /**
     * 予約履歴一覧取得
     */
    List<ReserveHistoryRes> index(int stuffId, ReserveHistoryReq reqForm);
}
