package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.ReserveHistory0003;
import com.c4c._2022server.entity.SalesHistory0006;
import com.c4c._2022server.form.customer.CustomerHomeInitRes;
import com.c4c._2022server.mapper.ReserveHistoryMapper;
import com.c4c._2022server.mapper.SalesHistoryMapper;
import com.c4c._2022server.service.CustomerHomeService;
import com.c4c._2022server.utils.EntityUtils;

@Service
public class CustomerHomeServiceImpl implements CustomerHomeService {
    @Autowired
    MessageSource messageSource;
    @Autowired
    EntityUtils entityUtils;
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
        // SELECTを実行し、データを取得する
        List<ReserveHistory0003> reserveHistory = reserveHistoryMapper.select0003(customerId);
        // Formにデータを詰める
        List<CustomerHomeInitRes> resFormList = new ArrayList<>();
        for (ReserveHistory0003 reserveHistory0003 : reserveHistory) {
            CustomerHomeInitRes resForm = new CustomerHomeInitRes();
            resForm.setMenu(reserveHistory0003.getMenu());
            resForm.setPrice(reserveHistory0003.getPrice());
            resForm.setReserveDatetime(reserveHistory0003.getReserveDatetime());
            resForm.setStuffLastName(reserveHistory0003.getStuffLastName());
            resForm.setStuffFirstName(reserveHistory0003.getStuffFirstName());
            resFormList.add(resForm);
        }

        // SELECTを実行し、データを取得する
        List<SalesHistory0006> salesHistory = salesHistoryMapper.select0006(customerId);
        // Formにデータを詰める
        for (SalesHistory0006 salesHistory0006 : salesHistory) {
            CustomerHomeInitRes resForm = new CustomerHomeInitRes();
            resForm.setMenu(salesHistory0006.getMenu());
            resForm.setPrice(salesHistory0006.getPrice());
            resForm.setReserveDatetime(salesHistory0006.getSalesDatetime());
            resForm.setStuffLastName(salesHistory0006.getStuffLastName());
            resForm.setStuffFirstName(salesHistory0006.getStuffFirstName());
            resFormList.add(resForm);
        }
        return resFormList;
    }
}
