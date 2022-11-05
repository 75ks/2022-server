package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.ReserveHistory0003;
import com.c4c._2022server.entity.SalesHistory0006;
import com.c4c._2022server.form.customer.CustomerHomeInitRes;
import com.c4c._2022server.form.customer.CustomerHomeReserveRes;
import com.c4c._2022server.form.customer.CustomerHomeSalesRes;
import com.c4c._2022server.mapper.ReserveHistoryMapper;
import com.c4c._2022server.mapper.SalesHistoryMapper;
import com.c4c._2022server.service.CustomerHomeService;

@Service
public class CustomerHomeServiceImpl implements CustomerHomeService {
    @Autowired
    ReserveHistoryMapper reserveHistoryMapper;
    @Autowired
    SalesHistoryMapper salesHistoryMapper;

    /**
     * 予約、来店履歴情報取得
     * @param customerId 顧客ID
     * @return 予約、来店履歴情報
     */
    @Override
    public CustomerHomeInitRes index(int customerId) {
        // レスポンスフォームを定義
        CustomerHomeInitRes resForm = new CustomerHomeInitRes();

        // SELECTを実行し、予約データを取得する
        ReserveHistory0003 reserveHistory = reserveHistoryMapper.select0003(customerId);
        // Formにデータを詰める
        CustomerHomeReserveRes reserveResForm = new CustomerHomeReserveRes();
        if (reserveHistory != null) {
            reserveResForm.setMenu(reserveHistory.getMenu());
            reserveResForm.setPrice(reserveHistory.getPrice());
            reserveResForm.setReserveDatetime(reserveHistory.getReserveDatetime());
            reserveResForm.setStuffLastName(reserveHistory.getStuffLastName());
            reserveResForm.setStuffFirstName(reserveHistory.getStuffFirstName());
        }
        resForm.setCustomerHomeReserve(reserveResForm);

        // SELECTを実行し、来店履歴データを取得する
        List<SalesHistory0006> salesHistoryList = salesHistoryMapper.select0006(customerId);
        // Formにデータを詰める
        List<CustomerHomeSalesRes> salesResFormList = new ArrayList<>();
        for (SalesHistory0006 salesHistory0006 : salesHistoryList) {
            CustomerHomeSalesRes salesResForm = new CustomerHomeSalesRes();
            salesResForm.setMenu(salesHistory0006.getMenu());
            salesResForm.setPrice(salesHistory0006.getPrice());
            salesResForm.setSalesDatetime(salesHistory0006.getSalesDatetime());
            salesResForm.setStuffLastName(salesHistory0006.getStuffLastName());
            salesResForm.setStuffFirstName(salesHistory0006.getStuffFirstName());
            salesResFormList.add(salesResForm);
        }
        resForm.setCustomerHomeSalesList(salesResFormList);

        return resForm;
    }
}
