package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.c4c._2022server.entity.MenuDetailExample;
import com.c4c._2022server.service.MenuManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.MenuDetail;
import com.c4c._2022server.form.MenuDetailManagementRes;
import com.c4c._2022server.mapper.MenuDetailMapper;

@Service
public class MenuManagementServiceImpI implements MenuManagementService {
    @Autowired
    MenuDetailMapper MenuDetailMapper;

    @Override
    public List<MenuDetailManagementRes> index(int storeId) {
        // SELECT文を実行し、データを取得する
        // MenuDetailExampleをnewする
        MenuDetailExample menuDetailExample = new MenuDetailExample();
        // 検索条件に店舗IDを設定する
        menuDetailExample.createCriteria().andStoreIdEqualTo(storeId);
        // SELECTを実行する
        List<MenuDetail> menuDetailList = MenuDetailMapper.selectByExample(menuDetailExample);
        // Formにデータを詰める
        List<MenuDetailManagementRes> menuManagementList = new ArrayList<>();
        for (MenuDetail MenuDetail : menuDetailList) {
            MenuDetailManagementRes tempResForm = new MenuDetailManagementRes();
            tempResForm.setMenuId(MenuDetail.getMenuId());
            tempResForm.setRankId(MenuDetail.getRankId());
            tempResForm.setPrice(MenuDetail.getPrice());
            menuManagementList.add(tempResForm);
        }
        return menuManagementList;
    }
}
