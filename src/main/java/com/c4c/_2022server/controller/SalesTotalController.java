package com.c4c._2022server.controller;

import java.util.List;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.SalesTotalMonthReq;
import com.c4c._2022server.form.SalesTotalMonthRes;
import com.c4c._2022server.form.SalesTotalYearReq;
import com.c4c._2022server.form.SalesTotalYearRes;
import com.c4c._2022server.service.impl.SalesTotalServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/salesTotal")
public class SalesTotalController {
    @Autowired
    SalesTotalServiceImpl salesTotalServiceImpl;

    /**
     * 売上情報取得(年)
     * @param jwt
     * @param reqForm
     * @return SalesTotalYearRes
     */
    @GetMapping("/year")
    public ResponseEntity<List<SalesTotalYearRes>> getSalesYear(@RequestHeader("Authorization") String jwt, SalesTotalYearReq reqForm) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int storeId = instance.getStoreId(jwt);
        List<SalesTotalYearRes> resFormList = salesTotalServiceImpl.getSalesYear(storeId, reqForm);
        return ResponseEntity.ok(resFormList);
    }

    /**
     * 売上情報取得(月)
     * @param jwt
     * @param reqForm
     * @return SalesTotalMonthRes
     */
    @GetMapping("/month")
    public ResponseEntity<SalesTotalMonthRes> getSalesMonth(@RequestHeader("Authorization") String jwt, SalesTotalMonthReq reqForm) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int storeId = instance.getStoreId(jwt);
        SalesTotalMonthRes resForm = salesTotalServiceImpl.getSalesMonth(storeId, reqForm);
        return ResponseEntity.ok(resForm);
    }
}
