package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.MenuDetail;
import com.c4c._2022server.entity.MenuDetailExample;
import com.c4c._2022server.form.MenuDetailManegementHIstoryUpdateReq;
import com.c4c._2022server.mapper.MenuDetailMapper;
import com.c4c._2022server.mapper.ReserveHistoryMapper;
import com.c4c._2022server.service.MenuManagementService;

@Service
public class MenuManagementServiceImpI implements MenuManagementService {

	
    @Autowired
    MenuDetailMapper MenuDetailMapper;
    
    @Autowired
    ReserveHistoryMapper reserveHistoryMapper;
    

//    @Override
//    public List<MenuDetailManagementRes> index(int storeId) {
//        // SELECT文を実行し、データを取得する
//        // MenuDetailExampleをnewする
//        MenuDetailExample menuDetailExample = new MenuDetailExample();
//        // 検索条件に店舗IDを設定する
//        menuDetailExample.createCriteria().andStoreIdEqualTo(storeId);
//        // SELECTを実行する
//        List<MenuDetail> menuDetailList = MenuDetailMapper.selectByExample(menuDetailExample);
//        // Formにデータを詰める
//        
//        List<MenuDetailManagementRes> menuManagementList = new ArrayList<>();
//        for (MenuDetail MenuDetail : menuDetailList) {
//            MenuDetailManagementRes tempResForm = new MenuDetailManagementRes();
//            tempResForm.setMenuId(MenuDetail.getMenuId());
//            tempResForm.setRankId(MenuDetail.getRankId());
//            tempResForm.setPrice(MenuDetail.getPrice());
//            menuManagementList.add(tempResForm);
//        }
//        return menuManagementList;
//    }
    @Override
    public  Map<Integer, List<MenuDetail>>  index(int storeId) {
        // SELECT文を実行し、データを取得する
        // MenuDetailExampleをnewする
        MenuDetailExample menuDetailExample = new MenuDetailExample();
        // 検索条件に店舗IDを設定する
        menuDetailExample.createCriteria().andStoreIdEqualTo(storeId);
        // SELECTを実行する
        List<MenuDetail> menuDetailList = MenuDetailMapper.selectByExample(menuDetailExample);
        // Formにデータを詰める
        Map<Integer, List<MenuDetail>> map = new HashMap<>();
        for (MenuDetail MenuDetail : menuDetailList) {

        	if(map.containsKey(MenuDetail.getMenuId())) {
//        		List<MenuDetail> _menuManagementList =  map.get(MenuDetail.getMenuId());
//        		_menuManagementList.add(MenuDetail);
        		map.get(MenuDetail.getMenuId()).add(MenuDetail);
        		} else {
        			List<MenuDetail> _menuManagementList = new ArrayList<>();
        			_menuManagementList.add(MenuDetail);
        			map.put(MenuDetail.getMenuId(), _menuManagementList);
        			
        		}
            
        }
		return map;
    }
    
    
    
    @Override
    public void deleteInsert(int storeId,List<MenuDetailManegementHIstoryUpdateReq> reqForm) {
        // SELECT文を実行し、データを取得する
        // MenuDetailExampleをnewする
        MenuDetailExample menuDetail = new MenuDetailExample();
        // 検索条件に店舗IDを設定する
        menuDetail.createCriteria().andStoreIdEqualTo(storeId);
        // SELECTを実行する
        MenuDetailMapper.deleteByExample(menuDetail);
        

        for(MenuDetailManegementHIstoryUpdateReq req: reqForm) {
        MenuDetail menuDetailInsert = new MenuDetail();
        menuDetailInsert.setStoreId(storeId);
        menuDetailInsert.setMenuId(req.getMenuId());
        menuDetailInsert.setRankId(req.getRankId());
        menuDetailInsert.setPrice(req.getPrice());
        MenuDetailMapper.insert(menuDetailInsert);
        }        
    }
    
    
    
    
//    @Override
//    public void register(int storeId, ReserveHistoryRegisterReq reqForm) {
//    	MenuDetailExample menuDetail = new MenuDetailExample();
//    }
}
