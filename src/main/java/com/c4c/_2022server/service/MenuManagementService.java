package com.c4c._2022server.service;


import java.util.List;

import com.c4c._2022server.form.MenuDetailManagementRes;
import com.c4c._2022server.form.MenuDetailManegementHIstoryUpdateReq;


public interface MenuManagementService {
	public List<MenuDetailManagementRes> index(int storeId);



	public void deleteInsert(int storeId,List<MenuDetailManegementHIstoryUpdateReq> reqForm);

	// public void register(int storeId, ReserveHistoryRegisterReq reqForm);


}