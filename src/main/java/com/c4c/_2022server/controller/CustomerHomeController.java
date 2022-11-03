package com.c4c._2022server.controller;

import java.util.List;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.customer.CustomerHomeInitRes;
import com.c4c._2022server.service.impl.CustomerHomeServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/customer/home")
public class CustomerHomeController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    CustomerHomeServiceImpl customerHomeServiceImpl;

    /**
     * 予約、来店履歴情報取得
     * @param jwt トークン
     * @return 予約、来店履歴情報
     * @throws AuthenticationException
     */
    @GetMapping("/initialize")
    public ResponseEntity<List<CustomerHomeInitRes>> index(@RequestHeader("CustomerAuthorization") String jwt) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        Integer customerId = instance.getId(jwt);
        List<CustomerHomeInitRes> resFormList = customerHomeServiceImpl.index(customerId);
        return ResponseEntity.ok(resFormList);
    }
}
