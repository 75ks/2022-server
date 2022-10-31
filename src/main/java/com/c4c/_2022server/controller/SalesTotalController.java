package com.c4c._2022server.controller;

import java.util.List;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.c4c._2022server.form.SalesHistoryRes;
import com.c4c._2022server.form.SalesTotalChartRes;
import com.c4c._2022server.form.SalesTotalMonthRes;
import com.c4c._2022server.form.SalesTotalPieChartRes;
import com.c4c._2022server.form.SalesTotalYearRes;
import com.c4c._2022server.service.impl.SalesTotalServiceImpl;
import com.c4c._2022server.utils.JWTUtils;

@RestController
@RequestMapping("/salesTotal")
public class SalesTotalController {
    @Autowired
    SalesTotalServiceImpl salesTotalServiceImpl;

    /**
     * 売上情報取得(年)
     * @param jwt トークン
     * @param salesYear 年(YYYY)
     * @return パラメータ年の一年分の売上データ
     * @throws AuthenticationException
     */
    @GetMapping("/year")
    public ResponseEntity<List<SalesTotalYearRes>> getSalesYear(@RequestHeader("Authorization") String jwt, @RequestParam(name = "salesYear", required = true) String salesYear) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int storeId = instance.getStoreId(jwt);
        List<SalesTotalYearRes> resFormList = salesTotalServiceImpl.getSalesYear(storeId, salesYear);
        return ResponseEntity.ok(resFormList);
    }

    /**
     * 売上情報取得(月)
     * @param jwt トークン
     * @param salesYearMonth 月(M)
     * @return パラメータ月の売上データ
     * @throws AuthenticationException
     */
    @GetMapping("/month")
    public ResponseEntity<SalesTotalMonthRes> getSalesMonth(@RequestHeader("Authorization") String jwt, @RequestParam(name = "salesYearMonth", required = true) String salesYearMonth) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int storeId = instance.getStoreId(jwt);
        SalesTotalMonthRes resForm = salesTotalServiceImpl.getSalesMonth(storeId, salesYearMonth);
        return ResponseEntity.ok(resForm);
    }

    /**
     * 売上情報取得(グラフ)
     * @param jwt トークン
     * @param salesYear 年(YYYY)
     * @return パラメータ年の一年分の売上データ(グラフ)
     * @throws AuthenticationException
     */
    @GetMapping("/charts")
    public ResponseEntity<List<SalesTotalChartRes>> getSalesChart(@RequestHeader("Authorization") String jwt, @RequestParam(name = "salesYear", required = true) String salesYear) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int storeId = instance.getStoreId(jwt);
        List<SalesTotalChartRes> resFormList = salesTotalServiceImpl.getSalesChart(storeId, salesYear);
        return ResponseEntity.ok(resFormList);
    }

    /**
     * 売上情報取得(グラフ)
     * @param jwt トークン
     * @param salesYearMonth 月(M)
     * @return パラメータ月の売上データ(グラフ)
     * @throws AuthenticationException
     */
    @GetMapping("/pieCharts")
    public ResponseEntity<List<SalesTotalPieChartRes>> getSalesPieChart(@RequestHeader("Authorization") String jwt, @RequestParam(name = "salesYearMonth", required = true) String salesYearMonth) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int storeId = instance.getStoreId(jwt);
        List<SalesTotalPieChartRes> resFormList = salesTotalServiceImpl.getSalesPieChart(storeId, salesYearMonth);
        return ResponseEntity.ok(resFormList);
    }

    /**
     * 売上情報一覧取得
     * @param jwt トークン
     * @param salesYearMonth 月(M)
     * @return 売上情報一覧
     * @throws AuthenticationException
     */
    @GetMapping("/")
    public ResponseEntity<List<SalesHistoryRes>> index(@RequestHeader("Authorization") String jwt, @RequestParam(name = "salesYearMonth", required = true) String salesYearMonth) throws AuthenticationException {
        JWTUtils instance = JWTUtils.getInstance();
        int storeId = instance.getStoreId(jwt);
        List<SalesHistoryRes> resFormList = salesTotalServiceImpl.index(storeId, salesYearMonth);
        return ResponseEntity.ok(resFormList);
    }
}
