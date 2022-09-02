package com.c4c._2022server.service.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.Customer;
import com.c4c._2022server.form.CustomerCreateReq;
import com.c4c._2022server.mapper.CustomerMapper;
import com.c4c._2022server.service.CustomerCreateService;

@Service
public class CustomerCreateServiceImpl implements CustomerCreateService {
    @Autowired
    CustomerMapper customerMapper;

    @Override
    public void register(int storeId, CustomerCreateReq reqForm) {
    	Customer customer = new Customer();
    	customer.setStoreId(storeId);
        customer.setLastName(reqForm.getLastName());
        customer.setFirstName(reqForm.getFirstName());
        customer.setLastNameKana(reqForm.getLastNameKana());
        customer.setFirstNameKana(reqForm.getFirstNameKana());
        customer.setBirthday(LocalDate.parse(reqForm.getBirthday()));
        customer.setAge(reqForm.getAge());
        customer.setGender(reqForm.getGender());
        customer.setPostalCode(reqForm.getPostalCode());
        customer.setPrefectureId(reqForm.getPrefectureId());
        customer.setAddress1(reqForm.getAddress1());
        customer.setAddress2(reqForm.getAddress2());
        customer.setAddress3(reqForm.getAddress3());
        customer.setPhoneNumber(reqForm.getPhoneNumber());
        customer.setEmail(reqForm.getEmail());

        // TODO null不許可のため仮実装
        // パスワード生成、メール送信処理を別途追加する
        customer.setPassword("pass1234");

        // INSERTを実行し、データを登録する
        customerMapper.insert(customer);
    }

}
