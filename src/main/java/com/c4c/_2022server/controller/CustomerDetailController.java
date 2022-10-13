package com.c4c._2022server.controller;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
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
//    CustomerDetailServiceImpl customerDetailServiceImpl;
    CustomerDetailServiceImpl customerDetailService;

    /**
     * 初期表示
     * @param jwt
     * @return
     */
    
//    @GetMapping("initialize")
//    public ResponseEntity<CustomerDetailRes> initialize(@RequestHeader("Authorization") String jwt, @RequestParam(value = "customerId", required = false) Integer givenCustomerId) {
//        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
//        // ログインユーザー情報の取得サンプル
//        System.out.println(loginUserInfo.get(jwtUtil.LOGIN_ID));
//        System.out.println(loginUserInfo.get(jwtUtil.USER_ID));
//        System.out.println(loginUserInfo.get(jwtUtil.ADMIN_FLG));
//
//        // 管理者フラグ
//        boolean isAdmin = loginUserInfo.get(jwtUtil.ADMIN_FLG) == Flag.ON;
//        // スキルシート表示対象ユーザーID
//        Integer userId = null;
//
//        if (givenUserId != null && isAdmin) {
//            // userIdがリクエストに設定されている、かつ管理者の場合
//            // リクエストに設定されているuserIdを使用する。
//            userId = givenUserId;
//        } else {
//            // それ以外の場合
//            // 自身のuserIdを使用する。
//            userId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());
//        }
//
//        // レスポンスForm
//        Keyst10200InitS resForm = keyst10200Service.initialize(userId);
//
//        return ResponseEntity.ok(resForm);
//    }
    
    @GetMapping("/initialize")
    public ResponseEntity<CustomerDetailRes> initialize(@RequestHeader("Authorization") String jwt) throws AuthenticationException {
    	
        // JWTからログインユーザーIDを取得する
    	JWTUtils instance = JWTUtils.getInstance();
    	Integer userId = instance.getId(jwt);
    	CustomerDetailRes resForm = customerDetailService.index(userId);
 
        return ResponseEntity.ok(resForm);
    	
    }

}

//    @GetMapping("/initialize")
//    public ResponseEntity<CustomerDetailRes> initialize(@RequestHeader("Authorization") String jwt)  {
//    	
//    	// 顧客詳細GETリクエストテスト
//    	System.out.println("テストOKです!"); 
//    	
//    	return null;
//    	
//    }
//    
//}
    
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

   
//    @GetMapping("/initialize")
//    public ResponseEntity<CustomerDetailRes> initialize(@RequestHeader("Authorization") String jwt) throws AuthenticationException {
//    	
//        // JWTからログイン中の顧客IDを取得する
//    	JWTUtils instance = JWTUtils.getInstance();
////    	Integer storeId = instance.getStoreId(jwt);  
//    	Integer customerId = instance.getId(jwt);  
//    	CustomerDetailRes resForm = CustomerDetailService.index(customerId);
////        // メッセージを設定
////    	CustomerDetailRes resForm = new CustomerDetailRes();
////        resForm.setMessages(messageSource.getMessage("success", new String[]{"登録"}, Locale.getDefault()));
//        return ResponseEntity.ok(resForm);
//    	
//    }

