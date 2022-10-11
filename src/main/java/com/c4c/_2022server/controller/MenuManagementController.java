package com.c4c._2022server.controller;


import com.c4c._2022server.form.MenuDetailManagementRes;
import com.c4c._2022server.mapper.CustomerMapper;
import com.c4c._2022server.mapper.MenuDetailMapper;
import com.c4c._2022server.service.impl.MenuManagementServiceImpl;
import com.c4c._2022server.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.security.sasl.AuthenticationException;
import java.util.List;

@RestController
@RequestMapping("/menuManagement")
public class MenuManagementController {
    @Autowired
    CustomerMapper CustomerMapper;

    @Autowired
    MenuManagementServiceImpl MenuManegementServiceImpI;

    @Autowired
    MenuDetailMapper MenuDetailMapper;

    @GetMapping("/initialize")
    public ResponseEntity<List<MenuDetailManagementRes>> index(@RequestHeader("Authorization") String jwt) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        Integer storeId = instance.getStoreId(jwt);

        List<MenuDetailManagementRes> menuDetailManagementResList = MenuManegementServiceImpI.index(storeId);
        return ResponseEntity.ok(menuDetailManagementResList);
    }
}
