package com.c4c._2022server.service;


import java.util.List;
import java.util.Map;

import com.c4c._2022server.entity.MenuDetail;
import com.c4c._2022server.form.MenuDetailManegementHIstoryUpdateReq;


public interface MenuManagementService {
	 public  Map<Integer, List<MenuDetail>>  index(int storeId);
 

 public void deleteInsert(int storeId,List<MenuDetailManegementHIstoryUpdateReq> reqForm);
 
// public void register(int storeId, ReserveHistoryRegisterReq reqForm);


}