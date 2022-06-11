package com.c4c._2022server.service;

import java.util.List;

import com.c4c._2022server.form.ReserveHistoryFormRes;

public interface ReserveHistoryService {
    /**
     * 予約履歴一覧取得
     */
    public List<ReserveHistoryFormRes> index();
}
