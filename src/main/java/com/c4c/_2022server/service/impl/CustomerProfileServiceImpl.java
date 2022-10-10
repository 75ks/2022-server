package com.c4c._2022server.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.Customer;




import com.c4c._2022server.form.CustomerListFormRes;
import com.c4c._2022server.mapper.CustomerMapper;
import com.c4c._2022server.service.CustomerProfileService;
import com.c4c._2022server.form.CustomerListFormReq;

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


        // PKによるSELECTを実行し、データを取得する
		Customer customer = customerMapper.selectByPrimaryKey(customerId);

		CustomerListFormRes resForm = new CustomerListFormRes();
		resForm.setCustomerId(customer.getCustomerId());
		resForm.setLastName(customer.getLastName());
		resForm.setFirstName(customer.getFirstName());
		resForm.setLastNameKana(customer.getLastNameKana());
		resForm.setFirstNameKana(customer.getFirstNameKana());
		resForm.setBirthday(customer.getBirthday().toString());
		resForm.setAge(customer.getAge());
		resForm.setGender(customer.getGender());
		resForm.setPostalCode(customer.getPostalCode());
		resForm.setPrefectureId(customer.getPrefectureId());
		resForm.setAddress1(customer.getAddress1());
		resForm.setAddress2(customer.getAddress2());
		resForm.setAddress3(customer.getAddress3());
		resForm.setPhoneNumber(customer.getPhoneNumber());
		resForm.setEmail(customer.getEmail());

        return resForm;
    }

    @Override
    public void update(int customerId,CustomerListFormReq reqForm) {
        Customer customer = customerMapper.selectByPrimaryKey(customerId);
        customer.setCustomerId(reqForm.getCustomerId());
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

        customerMapper.updateByPrimaryKey(customer);
    }
}
