package com.c4c._2022server.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.Customer;
import com.c4c._2022server.entity.CustomerExample;
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
    
	/**
	 * 
	 * @param storeId
	 * @param customerId
	 * @return
	 */

    @Override
    public CustomerDetailRes index(int storeId, int customerId) { 	
    	// 顧客・店舗IDに紐づく顧客一覧を取得する
	    CustomerExample customerExample = new CustomerExample();
    	customerExample.createCriteria().andStoreIdEqualTo(storeId).andStoreIdEqualTo(customerId);
    	List<Customer> customerList = customerMapper.selectByExample(customerExample);
    	// Formにデータを詰める（レスポンスフォームに移送する）
    	CustomerDetailRes resForm = new CustomerDetailRes();
//    	for (Customer customer : customerList) {
    	BeanUtils.copyProperties(customerList.get(0), resForm);
//    	}
    	return resForm;
    }  
}

