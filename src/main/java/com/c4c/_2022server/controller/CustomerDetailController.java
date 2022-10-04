package com.c4c._2022server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.CustomerDetailRes;
import com.c4c._2022server.service.impl.CustomerDetailServiceImpl;

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
    public ResponseEntity<CustomerDetailRes> initialize(@RequestHeader("Authorization") String jwt) {
        // テスト
    	System.out.println("テストOKです！");

        return null;
    }
//    @GetMapping("/initialize")
//    public ResponseEntity<CustomerCreateRes> register(@RequestHeader("Authorization") String jwt, @RequestBody @Valid CustomerCreateReq reqForm) throws AuthenticationException {
//    	// JWTから店舗IDを取得する
//    	JWTUtils instance = JWTUtils.getInstance();
//    	Integer storeId = instance.getStoreId(jwt);
//    	Integer stuffId = instance.getId(jwt);
//    	
//    	customerDetailServiceImpl.register(storeId, stuffId, reqForm);
//    	// メッセージを設定
//    	CustomerCreateRes resForm = new CustomerCreateRes();
//    	resForm.setMessages(messageSource.getMessage("success", new String[]{"登録"}, Locale.getDefault()));
//    	return ResponseEntity.ok(resForm);
//    }
}
