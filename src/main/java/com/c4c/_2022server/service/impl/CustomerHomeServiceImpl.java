package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.Customer;
import com.c4c._2022server.entity.CustomerExample;
import com.c4c._2022server.entity.ReserveHistory0003;
import com.c4c._2022server.exception.DuplicationException;
import com.c4c._2022server.exception.ExclusiveException;
import com.c4c._2022server.form.customer.CustomerHomeInitRes;
import com.c4c._2022server.form.customer.CustomerProfileInitRes;
import com.c4c._2022server.form.customer.CustomerProfileUpdateReq;
import com.c4c._2022server.mapper.CustomerMapper;
import com.c4c._2022server.mapper.ReserveHistoryMapper;
import com.c4c._2022server.service.CustomerHomeService;
import com.c4c._2022server.service.CustomerProfileService;
import com.c4c._2022server.utils.EntityUtils;

@Service
public class CustomerHomeServiceImpl implements CustomerHomeService {
    @Autowired
    MessageSource messageSource;
    @Autowired
    EntityUtils entityUtils;
    @Autowired
    ReserveHistoryMapper reserveHistoryMapper;

    /**
     * 顧客情報取得
     * @param reserveHistory0003Id 顧客ID
     * @return 顧客詳細情報
     */
    @Override
    public List<CustomerHomeInitRes> index(int customerId) {
        // SELECTを実行し、データを取得する
        List<ReserveHistory0003> reserveHistory = reserveHistoryMapper.select0003(customerId);
        //Formにデータを詰める
        List<CustomerHomeInitRes> resFormList = new ArrayList<>();
        for (ReserveHistory0003 reserveHistory0003 : reserveHistory) {
            CustomerHomeInitRes resForm = new CustomerHomeInitRes();
            resForm.setMenu(reserveHistory0003.getMenu());
            resForm.setPrice(reserveHistory0003.getPrice());
            resForm.setReserveDatetime(reserveHistory0003.getReserveDatetime());
            resForm.setReserveState(reserveHistory0003.getReserveState());
            resForm.setStuffLastName(reserveHistory0003.getStuffLastName());
            resForm.setStuffFirstName(reserveHistory0003.getStuffFirstName());
            resFormList.add(resForm);
        }
        return resFormList;
    }
}
