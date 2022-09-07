package com.c4c._2022server.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.ReserveHistory;
import com.c4c._2022server.entity.ReserveHistory0001;
import com.c4c._2022server.entity.ReserveHistory0002;
import com.c4c._2022server.entity.SalesHistory;
import com.c4c._2022server.enums.ReserveStateEnum;
import com.c4c._2022server.form.ReserveHistoryRegisterReq;
import com.c4c._2022server.form.ReserveHistoryReq;
import com.c4c._2022server.form.ReserveHistoryRes;
import com.c4c._2022server.form.ReserveHistoryUpdateReq;
import com.c4c._2022server.mapper.ReserveHistoryMapper;
import com.c4c._2022server.mapper.SalesHistoryMapper;
import com.c4c._2022server.service.ReserveHistoryService;
import com.c4c._2022server.utils.CommonUtils;
import com.c4c._2022server.utils.EntityUtils;

@Service
public class ReserveHistoryServiceImpl implements ReserveHistoryService {
    @Autowired
    EntityUtils entityUtils;
    @Autowired
    ReserveHistoryMapper reserveHistoryMapper;
    @Autowired
    SalesHistoryMapper salesHistoryMapper;

    /**
     * 予約履歴一覧取得
     * @return resFormList
     */
    @Override
    public List<ReserveHistoryRes> index(int storeId, ReserveHistoryReq reqForm) {
        // SELECT文を実行し、データを取得する
        List<ReserveHistory0001> reserveHistoryList = reserveHistoryMapper.select0001(storeId, reqForm);
        // Formにデータを詰める
        List<ReserveHistoryRes> resFormList = new ArrayList<>();
        for (ReserveHistory0001 reserveHistory0001 : reserveHistoryList) {
            ReserveHistoryRes resForm = new ReserveHistoryRes();
            BeanUtils.copyProperties(reserveHistory0001, resForm);
            resForm.setReserveStateName(reserveHistory0001.getReserveStateName());
            resFormList.add(resForm);
        }
        return resFormList;
    }

    /**
     * 予約情報登録
     * @param stuffId
     * @param storeId
     * @param reqForm
     */
    @Override
    public void register(int stuffId, int storeId, ReserveHistoryRegisterReq reqForm) {
        // SELECT文を実行し、データを取得する
        ReserveHistory0002 reserveHistory0002 = reserveHistoryMapper.select0002(reqForm.getStuffId(), reqForm.getMenuId());
        // Formにデータを詰める
        ReserveHistory reserveHistory = new ReserveHistory();
        reserveHistory.setStoreId(storeId);
        reserveHistory.setCustomerId(reqForm.getCustomerId());
        reserveHistory.setStuffId(reqForm.getStuffId());
        reserveHistory.setRank(reserveHistory0002.getRank());
        reserveHistory.setMenu(reserveHistory0002.getMenu());
        reserveHistory.setPrice(reserveHistory0002.getPrice());
        reserveHistory.setReserveDatetime(LocalDateTime.parse(reqForm.getReserveDateTime(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        reserveHistory.setReserveState(ReserveStateEnum.RESERVED.getCode());
        // INSERT時の共通設定
        entityUtils.setColumns4Insert(reserveHistory, stuffId);
        // INSERTを実行し、データを登録する
        reserveHistoryMapper.insert(reserveHistory);
    }

    /**
     * 予約情報更新
     * @param stuffId
     * @param storeId
     * @param reqForm
     */
    @Override
    public void update(int stuffId, int storeId, ReserveHistoryUpdateReq reqForm) {
        // SELECT文を実行し、データを取得する
        ReserveHistory0002 reserveHistory0002 = reserveHistoryMapper.select0002(reqForm.getStuffId(), reqForm.getMenuId());
        // Formにデータを詰める
        ReserveHistory reserveHistory = new ReserveHistory();
        reserveHistory.setReserveHistoryId(reqForm.getReserveHistoryId());
        reserveHistory.setStoreId(storeId);
        reserveHistory.setCustomerId(reqForm.getCustomerId());
        reserveHistory.setStuffId(reqForm.getStuffId());
        reserveHistory.setRank(reserveHistory0002.getRank());
        reserveHistory.setMenu(reserveHistory0002.getMenu());
        reserveHistory.setPrice(reserveHistory0002.getPrice());
        reserveHistory.setReserveDatetime(LocalDateTime.parse(reqForm.getReserveDateTime(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        reserveHistory.setReserveState(reqForm.getReserveState());
        // UPDATE時の共通設定
        entityUtils.setColumns4Update(reserveHistory, stuffId);
        // UPDATEを実行し、データを登録する
        reserveHistoryMapper.updateByPrimaryKeySelective(reserveHistory);

        // 予約状態が来店済の場合
        if (reqForm.getReserveState() == ReserveStateEnum.VISITED.getCode()) {
            // 更新した予約情報を取得
            reserveHistory = new ReserveHistory();
            reserveHistory = reserveHistoryMapper.selectByPrimaryKey(reqForm.getReserveHistoryId());
            // Formにデータを詰める
            SalesHistory salesHistory = new SalesHistory();
            BeanUtils.copyProperties(reserveHistory, salesHistory);
            salesHistory.setSalesDatetime(reserveHistory.getReserveDatetime());
            // INSERT時の共通処理
            entityUtils.setColumns4Insert(salesHistory, stuffId);
            // INSERTを実行し、データを登録
            salesHistoryMapper.insert(salesHistory);
        }
    }

    /**
     * 予約情報削除
     * @param stuffId
     * @param reqForm
     */
    @Override
    public void delete(int stuffId, ReserveHistoryUpdateReq reqForm) {
        // Formにデータを詰める
        ReserveHistory reserveHistory = new ReserveHistory();
        reserveHistory.setReserveHistoryId(reqForm.getReserveHistoryId());
        reserveHistory.setDeleteFlg(CommonUtils.ON);
        // UPDATE時の共通設定
        entityUtils.setColumns4Update(reserveHistory, stuffId);
        // UPDATEを実行し、データを登録する
        reserveHistoryMapper.updateByPrimaryKeySelective(reserveHistory);
    }
}
