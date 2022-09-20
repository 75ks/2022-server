package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.MenuDetail;
import com.c4c._2022server.form.MenuDetailManegementReq;
import com.c4c._2022server.form.MenuDetailManegementRes;
import com.c4c._2022server.mapper.MenuDetailMapper;

@Service
public class MenuManegementServiceImpI implements MenuManegementService{
    @Autowired
    MenuDetailMapper MenuDetailMapper;


    @Override
    public List<MenuDetailManegementRes> index(int storeId, MenuDetailManegementReq reqForm) {
        // SELECT文を実行し、データを取得する
    	List<MenuDetail> stuffList = MenuDetailMapper.selectByPrimaryKey(storeId, reqForm);
        // Formにデータを詰める
        List<MenuDetailManegementRes> menuManegementList = new ArrayList<>();
        for (MenuDetail MenuDetail : stuffList) {
        	MenuDetailManegementRes MenuManegementForm = new MenuDetailManegementRes();
        	MenuManegementForm.setStoreId(MenuDetail.getStoreId());
        	MenuManegementForm.setMenuId(MenuDetail.getMenuId());
        	MenuManegementForm.setRankId(MenuDetail.getRankId());
        	MenuManegementForm.setPrice(MenuDetail.getPrice());
        	MenuManegementForm.setDeleteFlg(MenuDetail.getDeleteFlg());
        	MenuManegementForm.setCreatedDatetime(MenuDetail.getCreatedDatetime());
        	MenuManegementForm.setCreatedUser(MenuDetail.getCreatedUser());
        	MenuManegementForm.setUpdateDatetime(MenuDetail.getUpdateDatetime());
        	MenuManegementForm.setUpdateUser(MenuDetail.getUpdateUser());
        	MenuManegementForm.setVersionExKey(MenuDetail.getVersionExKey());
        	menuManegementList.add(MenuManegementForm);
        }
        return menuManegementList;
    }
}
