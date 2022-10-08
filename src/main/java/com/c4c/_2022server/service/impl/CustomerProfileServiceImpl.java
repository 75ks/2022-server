package com.c4c._2022server.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.Customer;
import com.c4c._2022server.form.CustomerListFormRes;
import com.c4c._2022server.mapper.CustomerMapper;
import com.c4c._2022server.service.CustomerProfileService;

@Service
public class CustomerProfileServiceImpl implements CustomerProfileService {
    @Autowired
    CustomerMapper customerMapper;

    /**
     * スタッフ一覧取得
     * @return customerFormList
     */
    @Override
    public CustomerListFormRes index(int customerId) {
        // PKでデータを取得してcustomerに詰め込む
    	Customer customer = customerMapper.selectByPrimaryKey(customerId);
        // Formにデータを詰める
        CustomerListFormRes resForm = new CustomerListFormRes();

        	CustomerListFormRes customerForm = new CustomerListFormRes();
        	resForm.setCustomerId(customer.getCustomerId());
        	resForm.setLastName(customer.getLastName());
        	resForm.setFirstName(customer.getFirstName());
        	resForm.setLastNameKana(customer.getLastNameKana());
        	resForm.setFirstNameKana(customer.getFirstNameKana());
        	resForm.setBirthday(customer.getBirthday().toString());
        	resForm.setAge(customer.getAge());
        	resForm.setGender(customer.getGender());


        return resForm;
    }
}
