package com.c4c._2022server.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.Customer;
import com.c4c._2022server.entity.CustomerExample;
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

	/**
	 * 
	 * @param customerId
	 * @return
	 */

//    @Override
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
     * @param stuffId
     * @param storeid
     * @param reqForm
     */
    @Override
    public void register(int stuffId, int storeId, CustomerDetailRegisterReq reqForm) {
        // Formにデータを詰める
        Customer customer = new Customer();
        BeanUtils.copyProperties(reqForm, customer);
        // UPDATE時の共通設定
        entityUtils.setColumns4Update(customer, stuffId);
        // UPDATEを実行し、データを登録する
        customerMapper.updateByPrimaryKeySelective(customer);
    }
}