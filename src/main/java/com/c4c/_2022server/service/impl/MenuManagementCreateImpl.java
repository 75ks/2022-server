package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.c4c._2022server.entity.MenuHeader;
import com.c4c._2022server.entity.MenuHeaderExample;
import com.c4c._2022server.form.MenuManagementCreateRes;
import com.c4c._2022server.mapper.MenuHeaderMapper;
import com.c4c._2022server.mapper.RankByStoreMapper;
import com.c4c._2022server.service.MenuManagementCreateService;
import com.c4c._2022server.utils.EntityUtils;

public class MenuManagementCreateImpl implements MenuManagementCreateService{
	@Autowired
	EntityUtils entityUtils;
	
	@Autowired
	MenuHeaderMapper menuHeaderMapper;
	
	@Autowired
	RankByStoreMapper rankByStoreMapper;
	
	
    public List<MenuManagementCreateRes> index(int storeId) {
    	
    	MenuHeaderExample menuHeaderExample = new MenuHeaderExample();
//    	RankByStoreExample rankByStoreExample = new RankByStoreExample();
    	menuHeaderExample.createCriteria().andStoreIdEqualTo(storeId);
//    	rankByStoreExample.createCriteria().andStoreIdEqualTo(storeId);
        // SELECT文を実行し、データを取得する
    	List<MenuHeader> menuCreate = menuHeaderMapper.selectByExample(menuHeaderExample);
//    	List<RankByStore> RankCreate = rankByStoreMapper.selectByExample(rankByStoreExample);
    	
        // Formにデータを詰める
        List<MenuManagementCreateRes> menuFormList = new ArrayList<>();
        for (MenuHeader menu : menuCreate) {
        	MenuManagementCreateRes MenuForm = new MenuManagementCreateRes();
        	MenuForm.setMenuId(menu.getMenuId());
        	MenuForm.setMenu(menu.getMenu());
        	menuFormList.add(MenuForm);
        }
//        for (RankByStore rank : RankCreate) {
//        	MenuManagementCreateRes MenuForm = new MenuManagementCreateRes();
//        	MenuForm.setRankId(rank.getRankId());
//        	MenuForm.setRank(rank.getRank());
//        	menuFormList.add(MenuForm);
//        }
        
        
        return menuFormList;
    }

}
