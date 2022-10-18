package com.c4c._2022server.controller;


import com.c4c._2022server.form.customer.CustomerProfileUpdateReq;
import com.c4c._2022server.form.customer.CustomerProfileInitRes;
import com.c4c._2022server.form.customer.CustomerProfileUpdateRes;
import com.c4c._2022server.service.impl.CustomerProfileServiceImpl;
import com.c4c._2022server.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.security.sasl.AuthenticationException;
import javax.validation.Valid;
import java.util.Locale;

@RestController
@RequestMapping("/customer/profile")
public class CustomerProfileController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    CustomerProfileServiceImpl CustomerProfileServiceImpl;

    /**
     * 顧客情報取得
     * @return List{@literal<CustomerListFormRes>}
     */
    @GetMapping("/initialize")
    public ResponseEntity<CustomerProfileInitRes> index(@RequestHeader("CustomerAuthorization") String jwt) throws AuthenticationException {
    	JWTUtils instance = JWTUtils.getInstance();
    	Integer customerId = instance.getId(jwt);
        CustomerProfileInitRes resForm = CustomerProfileServiceImpl.index(customerId);
        return ResponseEntity.ok(resForm);
    }

    /**
     * 顧客情報更新
     * @param jwt
     * @param reqForm
     * @return
     * @throws AuthenticationException
     */
    @PutMapping("/update")
    public ResponseEntity<CustomerProfileUpdateRes> update(@RequestHeader("CustomerAuthorization") String jwt, @RequestBody @Valid CustomerProfileUpdateReq reqForm) throws AuthenticationException{
        JWTUtils instance = JWTUtils.getInstance();
        Integer customerId = instance.getId(jwt);
        //以下の1行で、ProfileScreenObjが保持しているversionExKeyをCustomerProfileUpdateReqにsetできるのではと思いました
        //reqForm.setVersionExKey(versionExKey);
        CustomerProfileServiceImpl.update(customerId, reqForm);
        CustomerProfileUpdateRes resForm = new CustomerProfileUpdateRes();
         resForm.setMessages(messageSource.getMessage("success", new String[]{"更新"}, Locale.getDefault()));
        return ResponseEntity.ok(resForm);
    }

}
