package com.c4c._2022server.service;

import java.util.List;

import com.c4c._2022server.form.SalesHistoryReq;
import com.c4c._2022server.form.SalesHistoryRes;
import com.c4c._2022server.form.SalesTotalChartReq;
import com.c4c._2022server.form.SalesTotalChartRes;
import com.c4c._2022server.form.SalesTotalMonthReq;
import com.c4c._2022server.form.SalesTotalMonthRes;
import com.c4c._2022server.form.SalesTotalYearReq;
import com.c4c._2022server.form.SalesTotalYearRes;

public interface SalesTotalService {
    /**
     * 売上情報取得(年)
     * @param storeId
     * @param reqForm
     */
    public List<SalesTotalYearRes> getSalesYear(int storeId, SalesTotalYearReq reqForm);

    /**
     * 売上情報取得(月)
     * @param storeId
     * @param reqForm
     */
    public SalesTotalMonthRes getSalesMonth(int storeId, SalesTotalMonthReq reqForm);

    /**
     * 売上情報取得(グラフ)
     * @param storeId
     * @param reqForm
     */
    public List<SalesTotalChartRes> getSalesChart(int storeId, SalesTotalChartReq reqForm);

    /**
     * 売上情報一覧取得
     * @param storeId
     * @param reqForm
     * @return reqForm
     */
    public List<SalesHistoryRes> index(int storeId, SalesHistoryReq reqForm);
}
