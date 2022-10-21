package com.c4c._2022server.service;

import java.util.List;

import com.c4c._2022server.form.SalesHistoryRes;
import com.c4c._2022server.form.SalesTotalChartRes;
import com.c4c._2022server.form.SalesTotalMonthRes;
import com.c4c._2022server.form.SalesTotalPieChartRes;
import com.c4c._2022server.form.SalesTotalYearRes;

public interface SalesTotalService {
    /**
     * 売上情報取得(年)
     * @param storeId
     * @param salesYear
     */
    public List<SalesTotalYearRes> getSalesYear(int storeId, String salesYear);

    /**
     * 売上情報取得(月)
     * @param storeId
     * @param salesYearMonth
     */
    public SalesTotalMonthRes getSalesMonth(int storeId, String salesYearMonth);

    /**
     * 売上情報取得(グラフ)
     * @param storeId
     * @param salesYear
     */
    public List<SalesTotalChartRes> getSalesChart(int storeId, String salesYear);

    /**
     * 売上情報取得(円グラフ)
     * @param storeId
     * @param salesYearMonth
     */
    public List<SalesTotalPieChartRes> getSalesPieChart(int storeId, String salesYearMonth);

    /**
     * 売上情報一覧取得
     * @param storeId
     * @param salesYearMonth
     */
    public List<SalesHistoryRes> index(int storeId, String salesYearMonth);
}
