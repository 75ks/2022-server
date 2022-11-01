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

import com.c4c._2022server.form.MenuDetailManagementRes;
import com.c4c._2022server.form.MenuDetailManegementHIstoryUpdateRes;
import com.c4c._2022server.form.MenuManegementUnityUpdateReq;
import com.c4c._2022server.mapper.CustomerMapper;
import com.c4c._2022server.mapper.MenuDetailMapper;
import com.c4c._2022server.service.impl.MenuManagementServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/menuManagement")
public class MenuManagementController {
    @Autowired
    CustomerMapper CustomerMapper;
    @Autowired
    MenuManagementServiceImpl menuManegementServiceImpl;
    @Autowired
    MenuDetailMapper menuDetailMapper;
    @Autowired
    MessageSource messageSource;

    /**
     * 初期表示
     * @param jwt トークン
     * @return メニュー情報
     * @throws AuthenticationException
     */
    @GetMapping("/initialize")
    public ResponseEntity<List<MenuDetailManagementRes>> index(@RequestHeader("Authorization") String jwt)
            throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        Integer storeId = instance.getStoreId(jwt);

        List<MenuDetailManagementRes> menuDetailManagementResList = menuManegementServiceImpl.index(storeId);
        return ResponseEntity.ok(menuDetailManagementResList);
    }

    /**
     * メニュー情報更新
     * @param jwt トークン
     * @param reqForm 画面からの入力値
     * @return 成功メッセージ
     * @throws AuthenticationException
     */
    @PutMapping("/update")
    public ResponseEntity<MenuDetailManegementHIstoryUpdateRes> update(@RequestHeader("Authorization") String jwt,
            @RequestBody @Valid MenuManegementUnityUpdateReq reqForm) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int storeId = instance.getStoreId(jwt);
        menuManegementServiceImpl.deleteInsert(storeId, reqForm);
        // メッセージを設定
        MenuDetailManegementHIstoryUpdateRes resForm = new MenuDetailManegementHIstoryUpdateRes();
        resForm.setMessages(messageSource.getMessage("success", new String[] { "更新" }, Locale.getDefault()));
        return ResponseEntity.ok(resForm);
    }
}