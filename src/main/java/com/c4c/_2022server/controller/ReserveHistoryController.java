package com.c4c._2022server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.ReserveHistoryReq;
import com.c4c._2022server.form.ReserveHistoryRes;
import com.c4c._2022server.service.impl.ReserveHistoryServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/reserves")
public class ReserveHistoryController {
    @Autowired
    ReserveHistoryServiceImpl reserveHistoryServiceImpl;

    /**
     * 予約履歴一覧取得
     * @return List{@literal<ReserveHistoryRes>}
     */
    @GetMapping("/")
    public ResponseEntity<List<ReserveHistoryRes>> index(@RequestHeader("Authorization") String jwt, ReserveHistoryReq reqForm) {
        int storeId = JWTUtils.getStoreId(jwt);
        List<ReserveHistoryRes> resFormList = reserveHistoryServiceImpl.index(storeId, reqForm);
        return ResponseEntity.ok(resFormList);
    }
}
