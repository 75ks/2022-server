package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.MenuDetail;
import com.c4c._2022server.entity.MenuDetailExample;
import com.c4c._2022server.form.MenuDetailManagementRes;
import com.c4c._2022server.form.MenuDetailRes;
import com.c4c._2022server.form.MenuManagementDetailUpdateReq;
import com.c4c._2022server.form.MenuManagementUpdateReq;
import com.c4c._2022server.form.MenuManegementUnityUpdateReq;
import com.c4c._2022server.mapper.MenuDetailMapper;
import com.c4c._2022server.mapper.ReserveHistoryMapper;
import com.c4c._2022server.service.MenuManagementService;
import com.c4c._2022server.utils.EntityUtils;

@Service
public class MenuManagementServiceImpl implements MenuManagementService {
	@Autowired
	EntityUtils entityUtils;

	@Autowired
	MenuDetailMapper menuDetailMapper;

	@Autowired
	ReserveHistoryMapper reserveHistoryMapper;

	@Override
	public List<MenuDetailManagementRes> index(int storeId) {
		// SELECT文を実行し、データを取得する
		// MenuDetailExampleをnewする
		MenuDetailExample menuDetailExample = new MenuDetailExample();
		// 検索条件に店舗IDを設定する
		menuDetailExample.createCriteria().andStoreIdEqualTo(storeId);
		// SELECTを実行する
		List<MenuDetail> menuDetailList = menuDetailMapper.selectByExample(menuDetailExample);
		// Formにデータを詰める
		Map<Integer, List<MenuDetail>> map = new HashMap<>();
		for (MenuDetail MenuDetail : menuDetailList) {

			if (map.containsKey(MenuDetail.getMenuId())) {

				map.get(MenuDetail.getMenuId()).add(MenuDetail);
			} else {

				List<MenuDetail> menuManagementLists = new ArrayList<>();
				menuManagementLists.add(MenuDetail);

				map.put(MenuDetail.getMenuId(), menuManagementLists);
			}

		}

		List<MenuDetailManagementRes> menuManagementList = new ArrayList<>();
		for (Map.Entry<Integer, List<MenuDetail>> entry : map.entrySet()) {
			MenuDetailManagementRes tempResForms = new MenuDetailManagementRes();

			tempResForms.setMenuId(entry.getKey());

			List<MenuDetailRes> menuDetailResList = new ArrayList<>();
			for (MenuDetail menuDetail : entry.getValue()) {
				MenuDetailRes tempRes = new MenuDetailRes();
				tempRes.setRankId(menuDetail.getRankId());
				tempRes.setPrice(menuDetail.getPrice());
				menuDetailResList.add(tempRes);
			}
			tempResForms.setDetail(menuDetailResList);
			menuManagementList.add(tempResForms);
		}
		return menuManagementList;
	}
	
	

	

	@Override
	public void deleteInsert(int storeId, MenuManegementUnityUpdateReq reqForm) {
		// SELECT文を実行し、データを取得する
		// MenuDetailExampleをnewする
		MenuDetailExample menuDetail = new MenuDetailExample();
		// 検索条件に店舗IDを設定する
		menuDetail.createCriteria().andStoreIdEqualTo(storeId);
		// SELECTを実行する
		menuDetailMapper.deleteByExample(menuDetail);
		
		List<MenuManagementUpdateReq> unity = reqForm.getUnity();
		for (MenuManagementUpdateReq req : unity) {
			if(req.getMenuId() == null) {
				continue;
			}
			MenuDetail menuDetailInsert = new MenuDetail();
			menuDetailInsert.setStoreId(storeId);
			menuDetailInsert.setMenuId(req.getMenuId());

			List<MenuManagementDetailUpdateReq> menuDetailList = req.getDetail();
			for (MenuManagementDetailUpdateReq menuManagementDetailUpdateReq : menuDetailList) {
//				Integer menuId = menuManagementDetailUpdateReq.getRankId();
				if(menuManagementDetailUpdateReq.getRankId() == null || menuManagementDetailUpdateReq.getPrice() == null) {
					continue;
				}
				menuDetailInsert.setRankId(menuManagementDetailUpdateReq.getRankId());
				menuDetailInsert.setPrice(menuManagementDetailUpdateReq.getPrice());
				entityUtils.setColumns4Insert(menuDetailInsert, storeId);
				menuDetailMapper.insert(menuDetailInsert);
			}

		}
		
	}
}
