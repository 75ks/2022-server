package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.SalesHistory0001;
import com.c4c._2022server.entity.SalesHistory0002;
import com.c4c._2022server.entity.SalesHistory0003;
import com.c4c._2022server.entity.SalesHistory0004;
import com.c4c._2022server.form.SalesHistoryReq;
import com.c4c._2022server.form.SalesHistoryRes;
import com.c4c._2022server.form.SalesTotalChartReq;
import com.c4c._2022server.form.SalesTotalChartRes;
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

    /**
     * 売上情報取得(グラフ)
     * @param storeId
     * @param reqForm
     * @return SalesTotalChartRes
     */
    @Override
    public List<SalesTotalChartRes> getSalesChart(int storeId, SalesTotalChartReq reqForm) {
        // 絞り込み用の値をセットする(YYYYM)
        reqForm.setJanuary(reqForm.getSalesYear() + "1");
        reqForm.setFebruary(reqForm.getSalesYear() + "2");
        reqForm.setMarch(reqForm.getSalesYear() + "3");
        reqForm.setApril(reqForm.getSalesYear() + "4");
        reqForm.setMay(reqForm.getSalesYear() + "5");
        reqForm.setJune(reqForm.getSalesYear() + "6");
        reqForm.setJuly(reqForm.getSalesYear() + "7");
        reqForm.setAugust(reqForm.getSalesYear() + "8");
        reqForm.setSeptember(reqForm.getSalesYear() + "9");
        reqForm.setOctober(reqForm.getSalesYear() + "10");
        reqForm.setNovember(reqForm.getSalesYear() + "11");
        reqForm.setDecember(reqForm.getSalesYear() + "12");
        // SELECT文を実行し、データを取得する
        List<SalesHistory0004> salesHistoryList = salesHistoryMapper.select0004(storeId, reqForm);
        // Formにデータを詰める
        List<SalesTotalChartRes> resFormList = new ArrayList<>();
        for (SalesHistory0004 salesHistory0004 : salesHistoryList) {
            SalesTotalChartRes resForm = new SalesTotalChartRes();
            resForm.setSalesMonth(salesHistory0004.getSalesMonth());
            resForm.setNumberOfVisitors(salesHistory0004.getNumberOfVisitors());
            resForm.setSalesAmount(salesHistory0004.getSalesAmount());
            resForm.setAverageAmount(salesHistory0004.getAverageAmount());
            resFormList.add(resForm);
        }
        return resFormList;
    }

    /**
     * 売上情報一覧取得
     * @param storeId
     * @param reqForm
     * @return List{@literal<SalesHistoryRes>}
     */
    @Override
    public List<SalesHistoryRes> index(int storeId, SalesHistoryReq reqForm) {
        // SELECT文を実行し、データを取得する
        List<SalesHistory0003> salesHistoryList = salesHistoryMapper.select0003(storeId, reqForm);
        // Formにデータを詰める
        List<SalesHistoryRes> resFormList = new ArrayList<>();
        for (SalesHistory0003 salesHistory0003 : salesHistoryList) {
            SalesHistoryRes resForm = new SalesHistoryRes();
            BeanUtils.copyProperties(salesHistory0003, resForm);
            resFormList.add(resForm);
        }
        return resFormList;
    }
}
