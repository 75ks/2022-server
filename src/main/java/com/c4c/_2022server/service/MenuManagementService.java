package com.c4c._2022server.service;

import java.util.List;

import com.c4c._2022server.form.MenuDetailManagementRes;
import com.c4c._2022server.form.MenuManegementUnityUpdateReq;

public interface MenuManagementService {
    /**
     * 初期表示
     * @param storeId 店舗情報
     * @return メニュー情報
     */
    public List<MenuDetailManagementRes> index(int storeId);

    /**
     * メニュー情報更新
     * @param storeId 店舗情報
     * @param reqForm 画面からの入力値
     */
    public void deleteInsert(int storeId, MenuManegementUnityUpdateReq reqForm);
}