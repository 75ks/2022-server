package com.c4c._2022server.controller;


import java.util.List;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.c4c._2022server.entity.Customer;
import com.c4c._2022server.entity.CustomerExample;
import com.c4c._2022server.form.MenuDetailManegementRes;
import com.c4c._2022server.mapper.CustomerMapper;
import com.c4c._2022server.mapper.MenuDetailMapper;
import com.c4c._2022server.service.impl.MenuManegementServiceImpI;
import com.c4c._2022server.utils.JWTUtils;

public class MenuManegement {
	@Autowired
	CustomerMapper CustomerMapper;
	
	@Autowired
	MenuManegementServiceImpI MenuManegementServiceImpI;
	
    @Autowired
    MenuDetailMapper MenuDetailMapper;


    @GetMapping("/MenuManegement")
    public ResponseEntity<List<MenuDetailManegementRes>> index(@RequestHeader("Authorization") String jwt) throws AuthenticationException {
 
        JWTUtils instance = JWTUtils.getInstance();
        Integer storeId = instance.getStoreId(jwt);
    	
        CustomerExample CustomerExample = new CustomerExample();
        CustomerExample.createCriteria().andStoreIdEqualTo(storeId);
        List<Customer> loginUser = CustomerMapper.selectByExample(CustomerExample);
        
        List<MenuDetailManegementRes> MenuManegement = MenuManegementServiceImpI.index(storeId, reqForm);
        return ResponseEntity.ok(MenuManegement);
       
        

    }
}
