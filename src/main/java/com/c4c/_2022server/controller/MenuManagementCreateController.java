package com.c4c._2022server.controller;

import java.util.List;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.MenuManagementCreateRes;
import com.c4c._2022server.service.impl.MenuManagementCreateImpl;
import com.c4c._2022server.utils.JWTUtils;
@RestController
@RequestMapping("/menuRegister")
public class MenuManagementCreateController {
	
    @Autowired
    MenuManagementCreateImpl menuManagementCreateImpl;
    
    @GetMapping("/")
    public ResponseEntity<List<MenuManagementCreateRes>> index(@RequestHeader("Authorization") String jwt) throws AuthenticationException {
    	JWTUtils instance = JWTUtils.getInstance();
    	int storeId = instance.getStoreId(jwt);
    	List<MenuManagementCreateRes> stuffFormList = menuManagementCreateImpl.index(storeId);
        return ResponseEntity.ok(stuffFormList);
    }

}
