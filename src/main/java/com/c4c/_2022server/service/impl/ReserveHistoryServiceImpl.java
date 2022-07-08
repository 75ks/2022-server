package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.constants.ReserveState;
import com.c4c._2022server.entity.ReserveHistory0001;
import com.c4c._2022server.form.ReserveHistoryFormRes;
import com.c4c._2022server.mapper.ReserveHistoryMapper;
import com.c4c._2022server.service.ReserveHistoryService;

@Service
public class ReserveHistoryServiceImpl implements ReserveHistoryService {
    @Autowired
    ReserveHistoryMapper reserveHistoryMapper;

    /**
     * 予約履歴一覧取得
     * @return null
     */
    @Override
    public List<ReserveHistoryFormRes> index() {
        // SELECT文を実行し、データを取得する
        List<ReserveHistory0001> reserveHistoryList = reserveHistoryMapper.select0001();
        // Formにデータを詰める
        List<ReserveHistoryFormRes> resFormList = new ArrayList<>();
        for (ReserveHistory0001 reserveHistory0001 : reserveHistoryList) {
            ReserveHistoryFormRes resForm = new ReserveHistoryFormRes();
            BeanUtils.copyProperties(reserveHistory0001, resForm);
            resFormList.add(resForm);
        }
        return resFormList;
    }
}
