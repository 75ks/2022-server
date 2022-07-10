package com.c4c._2022server.controller;

import java.util.List;

import com.c4c._2022server.form.ReserveHistoryReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        int stuffId = JWTUtils.getStuff(jwt);
        List<ReserveHistoryRes> resFormList = reserveHistoryServiceImpl.index(stuffId, reqForm);
        return ResponseEntity.ok(resFormList);
    }
}
