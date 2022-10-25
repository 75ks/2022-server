package com.c4c._2022server.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.Customer0002;
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
     * @param storeId
     * @param reqForm
     * @return List{@literal<CustomerListRes>}
     */
    @Override
    public List<CustomerListFormRes> index(int storeId, CustomerListFormReq reqForm) {
        // SELECT文を実行し、データを取得する
        List<Customer0002> customerList = customerMapper.select0002(storeId, reqForm);
        // Formにデータを詰める
        List<CustomerListFormRes> customerFormList = new ArrayList<>();
        for (Customer0002 customer0002 : customerList) {
            CustomerListFormRes customerForm = new CustomerListFormRes();
            customerForm.setCustomerId(customer0002.getCustomerId());
            customerForm.setLastName(customer0002.getLastName());
            customerForm.setFirstName(customer0002.getFirstName());
            customerForm.setLastNameKana(customer0002.getLastNameKana());
            customerForm.setFirstNameKana(customer0002.getFirstNameKana());
            customerForm.setAge(customer0002.getAge());
            customerForm.setGender(customer0002.getGender());
            customerFormList.add(customerForm);
        }
        return customerFormList;
    }
}
