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
				// List<MenuDetail> menuManagementList = map.get(MenuDetail.getMenuId());
				// menuManagementList.add(MenuDetail);
				map.get(MenuDetail.getMenuId()).add(MenuDetail);
			} else {
				// 値がない状態から値が取れないため、リストに値を入れる必要がある。
				List<MenuDetail> menuManagementLists = new ArrayList<>();
				menuManagementLists.add(MenuDetail);
				// リストに値を入れることによって、マップの値のところに値がputすることが可能になる。
				map.put(MenuDetail.getMenuId(), menuManagementLists);
			}

		}
		// MenuDetailManagementResに値を入れるためにnewする。
		List<MenuDetailManagementRes> menuManagementList = new ArrayList<>();
		for (Map.Entry<Integer, List<MenuDetail>> entry : map.entrySet()) {
			MenuDetailManagementRes tempResForms = new MenuDetailManagementRes();
			// メニューIDにキーとして値をセットする。
			tempResForms.setMenuId(entry.getKey());
			// MenuDetailManagementResの中にMenuDetailResというリストがあるため、newする必要がある。
			List<MenuDetailRes> menuDetailResList = new ArrayList<>();
			// メニューIdのキーに対して、値が複数あるため、二重ループの必要がある。
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
	
	
	
	
	
	
	
//
//	@Override
//	public void deleteInsert(int storeId, MenuManegementUnityUpdateReq reqForm) {
//		// SELECT文を実行し、データを取得する
//		// MenuDetailExampleをnewする
//		MenuDetailExample menuDetail = new MenuDetailExample();
//		// 検索条件に店舗IDを設定する
//		menuDetail.createCriteria().andStoreIdEqualTo(storeId);
//		// SELECTを実行する
//		menuDetailMapper.deleteByExample(menuDetail);
//		List<MenuManegementUnityUpdateReq> menuManagement = new ArrayList<>();
//		List<MenuDetail> menuDetailList = menuDetailMapper.selectByExample(menuDetail);
//
//		Map<Integer, List<MenuDetail>> map = new HashMap<>();
//		for (MenuDetail MenuDetail : menuDetailList) {
//
//			if (map.containsKey(MenuDetail.getMenuId())) {
//				// List<MenuDetail> menuManagementList = map.get(MenuDetail.getMenuId());
//				// menuManagementList.add(MenuDetail);
//				map.get(MenuDetail.getMenuId()).add(MenuDetail);
//			} else {
//				// 値がない状態から値が取れないため、リストに値を入れる必要がある。
//				List<MenuDetail> menuManagementLists = new ArrayList<>();
//				menuManagementLists.add(MenuDetail);
//				// リストに値を入れることによって、マップの値のところに値がputすることが可能になる。
//				map.put(MenuDetail.getMenuId(), menuManagementLists);
//			}
//
//		}
//
//		List<MenuManagementUpdateReq> menuIdList = new ArrayList<>();
//		for (Map.Entry<Integer, List<MenuDetail>> entry : map.entrySet()) {
//			MenuManagementUpdateReq menuIdLists = new MenuManagementUpdateReq();
//			// メニューIDにキーとして値をセットする。
//			menuIdLists.setMenuId(entry.getKey());
//			// MenuDetailManagementResの中にMenuDetailResというリストがあるため、newする必要がある。
//			List<MenuManagementDetailUpdateReq> menuDetailResList = new ArrayList<>();
//			// メニューIdのキーに対して、値が複数あるため、二重ループの必要がある。
//			for (MenuDetail menuDetails : entry.getValue()) {
//				MenuManagementDetailUpdateReq tempRes = new MenuManagementDetailUpdateReq();
//				tempRes.setRankId(menuDetails.getRankId());
//				tempRes.setPrice(menuDetails.getPrice());
//				menuDetailResList.add(tempRes);
//			}
//            menuIdLists.setDetail(menuDetailResList);
//            menuIdList.add(menuIdLists);
//            menuDetailMapper.selectByPrimaryKey(menuIdList);
//		}
//	}
//}
//
	@Override
	public void deleteInsert(int storeId, MenuManegementUnityUpdateReq reqForm) {
		// SELECT文を実行し、データを取得する
		// MenuDetailExampleをnewする
		MenuDetailExample menuDetail = new MenuDetailExample();
		// 検索条件に店舗IDを設定する
		menuDetail.createCriteria().andStoreIdEqualTo(storeId);
		// SELECTを実行する
		menuDetailMapper.deleteByExample(menuDetail);
//		List<MenuManegementUnityUpdateReq> menuManagement = new ArrayList<>();
//		List<MenuManagementUpdateReq> menuIdList = new ArrayList<>();
		
		List<MenuManagementUpdateReq> unity = reqForm.getUnity();
		for (MenuManagementUpdateReq req : unity) {
			MenuDetail menuDetailInsert = new MenuDetail();
			menuDetailInsert.setStoreId(storeId);
			menuDetailInsert.setMenuId(req.getMenuId());

			List<MenuManagementDetailUpdateReq> menuDetailList = req.getDetail();
			for (MenuManagementDetailUpdateReq menuManagementDetailUpdateReq : menuDetailList) {
				menuDetailInsert.setRankId(menuManagementDetailUpdateReq.getRankId());
				menuDetailInsert.setPrice(menuManagementDetailUpdateReq.getPrice());
			}
			entityUtils.setColumns4Insert(menuDetailInsert, storeId);
			menuDetailMapper.insert(menuDetailInsert);

		}
	}
}
