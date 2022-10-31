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

import com.c4c._2022server.form.MenuManagementCreateRes;
import com.c4c._2022server.form.MenuManagementCreateUpdateReq;
import com.c4c._2022server.form.MenuManagementCreateUpdateRes;
import com.c4c._2022server.mapper.MenuHeaderMapper;
import com.c4c._2022server.service.impl.MenuManagementCreateImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/menuRegister")
public class MenuManagementCreateController {

    @Autowired
    MenuManagementCreateImpl menuManagementCreateImpl;

    @Autowired
    MenuHeaderMapper menuHeaderMapper;

    @GetMapping("/Create")
    public ResponseEntity<List<MenuManagementCreateRes>> index(@RequestHeader("Authorization") String jwt)
            throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int storeId = instance.getStoreId(jwt);
        List<MenuManagementCreateRes> menuFormList = menuManagementCreateImpl.index(storeId);
        return ResponseEntity.ok(menuFormList);
    }

    @Autowired
    MessageSource messageSource;

    @PutMapping("/update")
    public ResponseEntity<MenuManagementCreateUpdateRes> update(@RequestHeader("Authorization") String jwt,
                                                                @RequestBody @Valid MenuManagementCreateUpdateReq reqForm) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int storeId = instance.getStoreId(jwt);
        menuManagementCreateImpl.deleteInsert(storeId, reqForm);
        // メッセージを設定
        MenuManagementCreateUpdateRes resForm = new MenuManagementCreateUpdateRes();
        resForm.setMessages(messageSource.getMessage("success", new String[]{"更新"}, Locale.getDefault()));
        return ResponseEntity.ok(resForm);
    }

}
