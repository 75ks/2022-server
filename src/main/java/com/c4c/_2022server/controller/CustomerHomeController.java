package com.c4c._2022server.controller;

import java.util.List;
import java.util.Locale;

import javax.security.sasl.AuthenticationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.exception.DuplicationException;
import com.c4c._2022server.exception.ExclusiveException;
import com.c4c._2022server.form.customer.CustomerHomeInitRes;
import com.c4c._2022server.service.impl.CustomerHomeServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/customer/home")
public class CustomerHomeController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    CustomerHomeServiceImpl CustomerHomeServiceImpl;

    /**
     * 顧客情報取得
     * @param jwt トークン
     * @return 顧客詳細情報
     * @throws AuthenticationException
     */
    @GetMapping("/initialize")
    public ResponseEntity<List<CustomerHomeInitRes>> index(@RequestHeader("CustomerAuthorization") String jwt) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        Integer customerId = instance.getId(jwt);
        List<CustomerHomeInitRes> resFormList = CustomerHomeServiceImpl.index(customerId);
        return ResponseEntity.ok(resFormList);
    }
}
