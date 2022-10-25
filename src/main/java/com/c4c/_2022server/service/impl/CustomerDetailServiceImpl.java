package com.c4c._2022server.service.impl;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.Customer;
import com.c4c._2022server.entity.CustomerExample;
import com.c4c._2022server.exception.DuplicationException;
import com.c4c._2022server.form.CustomerDetailRegisterReq;
import com.c4c._2022server.form.CustomerDetailRes;
import com.c4c._2022server.mapper.CustomerMapper;
import com.c4c._2022server.service.CustomerDetailService;
import com.c4c._2022server.utils.EntityUtils;

@Service
public class CustomerDetailServiceImpl implements CustomerDetailService {
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    EntityUtils entityUtils;
    @Autowired
    MessageSource messageSource;

    /**
     * 初期表示
     * @param storeId 店舗ID
     * @param customerId 顧客ID
     * @return 顧客詳細情報
     */
    @Override
    public CustomerDetailRes index(int storeId, int customerId) {
        // 顧客ID・店舗IDに紐づく1件を取得する
        CustomerExample customerExample = new CustomerExample();
        customerExample.createCriteria().andStoreIdEqualTo(storeId).andCustomerIdEqualTo(customerId);
        List<Customer> customerList = customerMapper.selectByExample(customerExample);
        // Formにデータを詰める（レスポンスフォームに移送する）
        CustomerDetailRes resForm = new CustomerDetailRes();
        BeanUtils.copyProperties(customerList.get(0), resForm);

        return resForm;
    }  

    /**
     * 顧客情報更新
     * @param stuffId スタッフID
     * @param storeid 店舗ID
     * @param reqForm 画面からの入力値
     * @throws DuplicationException
     */
    @Override
    public void register(int stuffId, int storeId, CustomerDetailRegisterReq reqForm) throws DuplicationException {
        // メールアドレスが登録済みかチェック
        Customer checkCustomer = customerMapper.select0001(reqForm.getEmail());
        if (checkCustomer != null) {
            throw new DuplicationException(messageSource.getMessage("error.email.registered", new String[]{}, Locale.getDefault()));
        }
        // Formにデータを詰める
        Customer customer = new Customer();
        BeanUtils.copyProperties(reqForm, customer);
        // UPDATE時の共通設定
        entityUtils.setColumns4Update(customer, stuffId);
        // UPDATEを実行し、データを登録する
        customerMapper.updateByPrimaryKeySelective(customer);
    }
}
