package com.c4c._2022server.service;


import java.util.List;

import com.c4c._2022server.form.MenuDetailManagementRes;


public interface MenuManagementService {
 List<MenuDetailManagementRes> index(int storeId);
}
