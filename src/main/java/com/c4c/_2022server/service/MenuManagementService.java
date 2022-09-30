package com.c4c._2022server.service;


import java.util.List;

import com.c4c._2022server.form.MenuDetailManagementRes;
import com.c4c._2022server.form.MenuDetailManegementHIstoryUpdateReq;
import com.c4c._2022server.form.ReserveHistoryRegisterReq;


public interface MenuManagementService {
 List<MenuDetailManagementRes> index(int storeId);
 

 public void deleteInsert(int storeId,List<MenuDetailManegementHIstoryUpdateReq> reqForm);
 
 public void register(int storeId, ReserveHistoryRegisterReq reqForm);


}