package com.c4c._2022server.controller;

import java.util.List;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.CustomerListFormReq;
import com.c4c._2022server.form.CustomerListFormRes;
import com.c4c._2022server.service.impl.CustomerProfileServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/customer")
public class CustomerProfileController {
    @Autowired
    CustomerProfileServiceImpl CustomerProfileServiceImpl;

    /**
     * スタッフ一覧取得
     * @return List{@literal<StuffListRes>}
     */
    @GetMapping("/profile")
    public ResponseEntity<List<CustomerListFormRes>> index(@RequestHeader("Authorization") String jwt, CustomerListFormReq reqForm) throws AuthenticationException {
    	JWTUtils instance = JWTUtils.getInstance();
    	Integer customerId = instance.getId(jwt);
    	List<CustomerListFormRes> customerFormList = CustomerProfileServiceImpl.index(customerId, reqForm);
        return ResponseEntity.ok(customerFormList);
    }
}
