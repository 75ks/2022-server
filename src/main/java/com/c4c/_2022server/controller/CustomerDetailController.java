package com.c4c._2022server.controller;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.CustomerDetailRes;
import com.c4c._2022server.service.impl.CustomerDetailServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/customerDetail")
public class CustomerDetailController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    CustomerDetailServiceImpl customerDetailServiceImpl;

    /**
     * 初期表示
     * @param jwt
     * @return
     */
    
    @GetMapping("/initialize")
    public ResponseEntity<CustomerDetailRes> index(@RequestHeader("Authorization") String jwt, @RequestParam(name = "customerId", required = true) Integer givenCustomerId) throws AuthenticationException {
        // JWTから店舗IDを取得する
        JWTUtils instance = JWTUtils.getInstance();
        int storeId = instance.getStoreId(jwt);
    	// レスポンスForm
	    CustomerDetailRes resForm = customerDetailServiceImpl.index(storeId, givenCustomerId);
	    
	    return ResponseEntity.ok(resForm);
    }
}
