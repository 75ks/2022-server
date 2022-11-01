package com.c4c._2022server.service;

import java.util.List;

import com.c4c._2022server.form.MenuManagementCreateRes;
import com.c4c._2022server.form.MenuManagementCreateUpdateReq;

public interface MenuManagementCreateService {
    /**
     * 初期表示
     * @param storeId 店舗ID
     * @return メニュー情報
     */
     List<MenuManagementCreateRes> index(int storeId);
     
     /**
      * メニュー情報更新
      * @param storeId 店舗ID
      * @param reqForm 画面からの入力値
      */
     public void deleteInsert(int storeId, MenuManagementCreateUpdateReq reqForm);
}
