package com.c4c._2022server.service;

import java.util.List;

import com.c4c._2022server.form.MenuManagementCreateRes;
import com.c4c._2022server.form.MenuManagementCreateUpdateReq;

public interface MenuManagementCreateService {
	
	 List<MenuManagementCreateRes> index(int storeId);
	 
	 
	 public void deleteInsert(int storeId, MenuManagementCreateUpdateReq reqForm);

}
