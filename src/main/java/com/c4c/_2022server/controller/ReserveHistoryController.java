package com.c4c._2022server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.ReserveHistoryFormRes;
import com.c4c._2022server.service.impl.ReserveHistoryServiceImpl;

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
    public ResponseEntity<List<ReserveHistoryFormRes>> index() {
        List<ReserveHistoryFormRes> resFormList = reserveHistoryServiceImpl.index();
        return ResponseEntity.ok(resFormList);
    }
}
