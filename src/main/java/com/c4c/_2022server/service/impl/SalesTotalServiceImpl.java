package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.SalesHistory0001;
import com.c4c._2022server.entity.SalesHistory0002;
import com.c4c._2022server.form.SalesTotalMonthReq;
import com.c4c._2022server.form.SalesTotalMonthRes;
import com.c4c._2022server.form.SalesTotalYearReq;
import com.c4c._2022server.form.SalesTotalYearRes;
import com.c4c._2022server.mapper.SalesHistoryMapper;
import com.c4c._2022server.service.SalesTotalService;

@Service
public class SalesTotalServiceImpl implements SalesTotalService {
    @Autowired
    SalesHistoryMapper salesHistoryMapper;

    /**
     * 売上情報取得(年)
     * @param storeId
     * @param reqForm
     * @return SalesTotalYearRes
     */
    @Override
    public List<SalesTotalYearRes> getSalesYear(int storeId, SalesTotalYearReq reqForm) {
        // SELECT文を実行し、データを取得する
        List<SalesHistory0001> salesHistoryList = salesHistoryMapper.select0001(storeId, reqForm);
        // Formにデータを詰める
        List<SalesTotalYearRes> resFormList = new ArrayList<>();
        for (SalesHistory0001 salesHistory0001 : salesHistoryList) {
            SalesTotalYearRes resForm = new SalesTotalYearRes();
            resForm.setSalesMonth(salesHistory0001.getSalesMonth());
            resForm.setNumberOfVisitors(salesHistory0001.getNumberOfVisitors());
            resForm.setSalesAmount(salesHistory0001.getSalesAmount());
            resForm.setAverageAmount(salesHistory0001.getAverageAmount());
            resFormList.add(resForm);
        }
        return resFormList;
    }

    /**
     * 売上情報取得(月)
     * @param storeId
     * @param reqForm
     * @return SalesTotalMonthRes
     */
    @Override
    public SalesTotalMonthRes getSalesMonth(int storeId, SalesTotalMonthReq reqForm) {
        // SELECT文を実行し、データを取得する
        SalesHistory0002 salesHistory0002 = salesHistoryMapper.select0002(storeId, reqForm);
        // Formにデータを詰める
        SalesTotalMonthRes resForm = new SalesTotalMonthRes();
        resForm.setNumberOfVisitors(salesHistory0002.getNumberOfVisitors());
        resForm.setSalesAmount(salesHistory0002.getSalesAmount());
        resForm.setAverageAmount(salesHistory0002.getAverageAmount());
        return resForm;
    }
}
