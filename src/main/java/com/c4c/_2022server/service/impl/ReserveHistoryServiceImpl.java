package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.c4c._2022server.form.ReserveHistoryReq;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.constants.ReserveState;
import com.c4c._2022server.entity.ReserveHistory0001;
import com.c4c._2022server.form.ReserveHistoryRes;
import com.c4c._2022server.mapper.ReserveHistoryMapper;
import com.c4c._2022server.service.ReserveHistoryService;

@Service
public class ReserveHistoryServiceImpl implements ReserveHistoryService {
    @Autowired
    ReserveHistoryMapper reserveHistoryMapper;

    /**
     * 予約履歴一覧取得
     * @return resFormList
     */
    @Override
    public List<ReserveHistoryRes> index(int stuffId, ReserveHistoryReq reqForm) {
        // SELECT文を実行し、データを取得する
        List<ReserveHistory0001> reserveHistoryList = reserveHistoryMapper.select0001(stuffId, reqForm);
        // Formにデータを詰める
        List<ReserveHistoryRes> resFormList = new ArrayList<>();
        for (ReserveHistory0001 reserveHistory0001 : reserveHistoryList) {
            ReserveHistoryRes resForm = new ReserveHistoryRes();
            BeanUtils.copyProperties(reserveHistory0001, resForm);
            resForm.setReserveState(ReserveState.getByCode(reserveHistory0001.getReserveState()).getName());
            resFormList.add(resForm);
        }
        return resFormList;
    }
}
