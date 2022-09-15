package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.CustomerList0001;
import com.c4c._2022server.form.CustomerListFormReq;
import com.c4c._2022server.form.CustomerListFormRes;
import com.c4c._2022server.mapper.CustomerMapper;
import com.c4c._2022server.service.CustomerListService;

@Service
public class CustomerListServiceImpl implements CustomerListService {
    @Autowired
    CustomerMapper customerMapper;

    /**
     * 顧客一覧取得
     * @return customerFormList
     */
    @Override
    public List<CustomerListFormRes> index(int storeId, CustomerListFormReq reqForm) {
        // SELECT文を実行し、データを取得する
    	List<CustomerList0001> customerList = customerMapper.select0002(storeId, reqForm);
        // Formにデータを詰める
        List<CustomerListFormRes> customerFormList = new ArrayList<>();
        for (CustomerList0001 customerList0001 : customerList) {
        	CustomerListFormRes customerForm = new CustomerListFormRes();
        	customerForm.setCustomerId(customerList0001.getCustomerId());
        	customerForm.setStoreId(customerList0001.getStoreId());
        	customerForm.setLastName(customerList0001.getLastName());
        	customerForm.setFirstName(customerList0001.getFirstName());
        	customerForm.setLastNameKana(customerList0001.getLastNameKana());
        	customerForm.setFirstNameKana(customerList0001.getFirstNameKana());
        	customerForm.setRank(customerList0001.getRank());
        	customerForm.setBirthday(customerList0001.getBirthday());
        	customerForm.setAge(customerList0001.getAge());
        	customerForm.setGender(customerList0001.getGender());
        	customerFormList.add(customerForm);
        }
        return customerFormList;
	}
}
