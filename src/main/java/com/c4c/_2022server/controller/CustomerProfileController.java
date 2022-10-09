package com.c4c._2022server.controller;


import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<CustomerListFormRes> index(@RequestHeader("CustomerAuthorization") String jwt) throws AuthenticationException {
    	JWTUtils instance = JWTUtils.getInstance();
    	Integer customerId = instance.getId(jwt);
    	CustomerListFormRes resForm = CustomerProfileServiceImpl.index(customerId);
        return ResponseEntity.ok(resForm);
    }
}
