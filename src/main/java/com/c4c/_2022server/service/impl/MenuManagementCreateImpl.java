package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.MenuHeader;
import com.c4c._2022server.entity.MenuHeaderExample;
import com.c4c._2022server.form.MenuManagementCreateRes;
import com.c4c._2022server.form.MenuManagementCreateUpdateReq;
import com.c4c._2022server.mapper.MenuHeaderMapper;
import com.c4c._2022server.service.MenuManagementCreateService;
import com.c4c._2022server.utils.EntityUtils;

@Service
public class MenuManagementCreateImpl implements MenuManagementCreateService{
	@Autowired
	EntityUtils entityUtils;
	
	@Autowired
	MenuHeaderMapper menuHeaderMapper;

	
	@Override
    public List<MenuManagementCreateRes> index(int storeId) {
    	
    	MenuHeaderExample menuHeaderExample = new MenuHeaderExample();
    	menuHeaderExample.createCriteria().andStoreIdEqualTo(storeId);
        // SELECT文を実行し、データを取得する
    	List<MenuHeader> menuCreate = menuHeaderMapper.selectByExample(menuHeaderExample);
    	
        // Formにデータを詰める
        List<MenuManagementCreateRes> menuFormList = new ArrayList<>();
        for (MenuHeader menu : menuCreate) {
        	MenuManagementCreateRes MenuForm = new MenuManagementCreateRes();
        	MenuForm.setMenuId(menu.getMenuId());
        	MenuForm.setMenu(menu.getMenu());
        	menuFormList.add(MenuForm);
        }     
        return menuFormList;
    }
	
	@Override
    public void deleteInsert(int storeId, MenuManagementCreateUpdateReq reqForm) {
		MenuHeaderExample menuHeaderExample = new MenuHeaderExample();
		menuHeaderExample.createCriteria().andStoreIdEqualTo(storeId);	
		menuHeaderMapper.deleteByExample(menuHeaderExample);
		
		List<MenuManagementCreateUpdateReq> menuCreate = new ArrayList<>();
		for(MenuManagementCreateUpdateReq menuManagementCreate : menuCreate) {
			MenuHeader menuHeader = new MenuHeader();
			menuHeader.setStoreId(storeId);
			menuHeader.setMenuId(menuManagementCreate.getMenuId());
			menuHeader.setMenu(menuManagementCreate.getMenu());	
			entityUtils.setColumns4Insert(menuHeader, storeId);
			menuHeaderMapper.insert(menuHeader);
		}
    }
}
