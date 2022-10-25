package com.c4c._2022server.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.ReserveHistory;
import com.c4c._2022server.entity.ReserveHistory0002;
import com.c4c._2022server.entity.Stuff;
import com.c4c._2022server.enums.ReserveStateEnum;
import com.c4c._2022server.form.ReserveRegisterReq;
import com.c4c._2022server.mapper.ReserveHistoryMapper;
import com.c4c._2022server.mapper.StuffMapper;
import com.c4c._2022server.service.ReserveRegisterService;
import com.c4c._2022server.utils.EntityUtils;

@Service
public class ReserveRegisterServiceImpl implements ReserveRegisterService {
    @Autowired
    EntityUtils entityUtils;
    @Autowired
    StuffMapper stuffMapper;
    @Autowired
    ReserveHistoryMapper reserveHistoryMapper;

    /**
     * ランクID取得
     * @param stuffId スタッフID
     * @return ランクID
     */
    public Integer getRankId(Integer stuffId) {
        // SELECT文を実行し、データを取得する
        Stuff stuff = stuffMapper.selectByPrimaryKey(stuffId);
        return stuff.getRankId();
    }

    /**
     * 予約情報登録
     * @param customerId 顧客ID
     * @param storeId 店舗ID
     * @param reqForm 画面からの入力値
     */
    public void register(int customerId, int storeId, ReserveRegisterReq reqForm) {
        // SELECT文を実行し、データを取得する
        ReserveHistory0002 reserveHistory0002 = reserveHistoryMapper.select0002(reqForm.getStuffId(), reqForm.getMenuId());
        // Formにデータを詰める
        ReserveHistory reserveHistory = new ReserveHistory();
        reserveHistory.setStoreId(storeId);
        reserveHistory.setCustomerId(customerId);
        reserveHistory.setStuffId(reqForm.getStuffId());
        reserveHistory.setRank(reserveHistory0002.getRank());
        reserveHistory.setMenu(reserveHistory0002.getMenu());
        reserveHistory.setPrice(reserveHistory0002.getPrice());
        reserveHistory.setReserveDatetime(LocalDateTime.parse(reqForm.getReserveDateTime(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        reserveHistory.setReserveState(ReserveStateEnum.RESERVED.getCode());
        // INSERT時の共通設定
        entityUtils.setColumnsNonUser4Insert(reserveHistory);
        // INSERTを実行し、データを登録する
        reserveHistoryMapper.insert(reserveHistory);
    }
}
