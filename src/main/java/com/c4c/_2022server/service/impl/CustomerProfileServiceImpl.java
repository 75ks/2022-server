package com.c4c._2022server.service.impl;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.Customer;
import com.c4c._2022server.entity.CustomerExample;
import com.c4c._2022server.exception.DuplicationException;
import com.c4c._2022server.exception.ExclusiveException;
import com.c4c._2022server.form.customer.CustomerProfileInitRes;
import com.c4c._2022server.form.customer.CustomerProfileUpdateReq;
import com.c4c._2022server.mapper.CustomerMapper;
import com.c4c._2022server.service.CustomerProfileService;
import com.c4c._2022server.utils.EntityUtils;

@Service
public class CustomerProfileServiceImpl implements CustomerProfileService {
    @Autowired
    MessageSource messageSource;
    @Autowired
    EntityUtils entityUtils;
    @Autowired
    CustomerMapper customerMapper;

    /**
     * 顧客情報取得
     * @param customerId 顧客ID
     * @return 顧客詳細情報
     */
    @Override
    public CustomerProfileInitRes index(int customerId) {
        // PKによるSELECTを実行し、データを取得する
        Customer customer = customerMapper.selectByPrimaryKey(customerId);

        CustomerProfileInitRes resForm = new CustomerProfileInitRes();
        resForm.setCustomerId(customer.getCustomerId());
        resForm.setLastName(customer.getLastName());
        resForm.setFirstName(customer.getFirstName());
        resForm.setLastNameKana(customer.getLastNameKana());
        resForm.setFirstNameKana(customer.getFirstNameKana());
        if (customer.getBirthday() != null) {
            resForm.setBirthday(customer.getBirthday().toString());
        }
        resForm.setAge(customer.getAge());
        resForm.setGender(customer.getGender());
        resForm.setPostalCode(customer.getPostalCode());
        resForm.setPrefectureId(customer.getPrefectureId());
        resForm.setAddress1(customer.getAddress1());
        resForm.setAddress2(customer.getAddress2());
        resForm.setAddress3(customer.getAddress3());
        resForm.setPhoneNumber(customer.getPhoneNumber());
        resForm.setEmail(customer.getEmail());
        resForm.setVersionExKey(customer.getVersionExKey());

        return resForm;
    }

    /**
     * 顧客情報更新
     * @param customerId 顧客ID
     * @param reqForm 画面からの入力値
     * @throws ExclusiveException
     * @throws DuplicationException
     */
    @Override
    public void update(int customerId, CustomerProfileUpdateReq reqForm) throws ExclusiveException, DuplicationException {
        // バージョンチェック
        CustomerExample customerExample = new CustomerExample();
        customerExample.createCriteria()
                .andCustomerIdEqualTo(customerId) // 顧客ID
                .andVersionExKeyEqualTo(reqForm.getVersionExKey()); // 排他制御カラム
        Customer customer = customerMapper.selectByExample(customerExample) // 検索を行う
                .stream() // streamに変換する
                .findFirst() // 先頭の1件を取得する
                .orElse(null); // 先頭の1件が取得できない場合は、nullを返す

        // 検索結果が取得できなかった場合
        if (customer == null) {
            // ExclusiveExceptionをスローする
            throw new ExclusiveException(messageSource.getMessage("error.exclusive", new String[]{}, Locale.getDefault()));
        }
        // メールアドレスが登録済みかチェック
        Customer checkCustomer = customerMapper.select0001(reqForm.getEmail());
        if (checkCustomer != null) {
            throw new DuplicationException(messageSource.getMessage("error.email.registered", new String[]{}, Locale.getDefault()));
        }

        customer.setLastName(reqForm.getLastName());
        customer.setFirstName(reqForm.getFirstName());
        customer.setLastNameKana(reqForm.getLastNameKana());
        customer.setFirstNameKana(reqForm.getFirstNameKana());
        customer.setBirthday(reqForm.getBirthday());
        customer.setAge(reqForm.getAge());
        customer.setGender(reqForm.getGender());
        customer.setPostalCode(reqForm.getPostalCode());
        customer.setPrefectureId(reqForm.getPrefectureId());
        customer.setAddress1(reqForm.getAddress1());
        customer.setAddress2(reqForm.getAddress2());
        customer.setAddress3(reqForm.getAddress3());
        customer.setPhoneNumber(reqForm.getPhoneNumber());
        customer.setEmail(reqForm.getEmail());

        // UPDATE時の共通設定
        entityUtils.setColumns4Update(customer, customerId);
        customerMapper.updateByPrimaryKey(customer);
    }
}
