package com.c4c._2022server.service;

import java.util.List;

import com.c4c._2022server.form.StuffListFormReq;
import com.c4c._2022server.form.StuffListFormRes;

public interface StuffListService {
    /**
     * スタッフ一覧取得
     */
    List<StuffListFormRes> index(int stuffId, StuffListFormReq reqForm);
}
