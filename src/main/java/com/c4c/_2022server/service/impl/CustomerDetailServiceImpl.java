package com.c4c._2022server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c._2022server.entity.Customer;
import com.c4c._2022server.form.CustomerDetailRes;
import com.c4c._2022server.mapper.CustomerMapper;
import com.c4c._2022server.utils.EntityUtils;

@Service
public class CustomerDetailServiceImpl {
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
    public CustomerDetailRes index(int customerId) {
    	// 顧客IDに紐づく1件を取得する
    	Customer customer = customerMapper.selectByPrimaryKey(customerId);
    	// Formにデータを詰める（レスポンスフォームに移送する）
    	CustomerDetailRes resForm = new CustomerDetailRes();
    	resForm.setLastName(customer.getLastName());
       	resForm.setFirstName(customer.getFirstName());
    	
    	return resForm;
    }  
}
    
//    @Override
//    public void register(int storeId, int stuffId, CustomerDetailReq reqForm) {
//    	Customer customer = new Customer();
//    	customer.setStoreId(storeId);
//    	customer.setLastName(reqForm.getLastName());
//    	customer.setFirstName(reqForm.getFirstName());
//    	customer.setLastNameKana(reqForm.getLastNameKana());
//    	customer.setFirstNameKana(reqForm.getFirstNameKana());
//    	// 生年月日がnullまたは空文字でない場合
//    	if (!(Objects.equals(reqForm.getBirthday(), null) || Objects.equals(reqForm.getBirthday(), ""))) {
//    		customer.setBirthday(LocalDate.parse(reqForm.getBirthday()));
//    	}
//    	customer.setAge(reqForm.getAge());
//    	customer.setGender(reqForm.getGender());
//    	customer.setPostalCode(reqForm.getPostalCode());
//    	customer.setPrefectureId(reqForm.getPrefectureId());
//    	customer.setAddress1(reqForm.getAddress1());
//    	customer.setAddress2(reqForm.getAddress2());
//    	customer.setAddress3(reqForm.getAddress3());
//    	customer.setPhoneNumber(reqForm.getPhoneNumber());
//    	customer.setEmail(reqForm.getEmail());
//    }
//    	// パスワード生成
//    	String randomPassword = createRandomPassword();
//    	customer.setPassword(randomPassword);
//    	// 初回ログインフラグをOFFで設定
//    	customer.setFirstLoginFlg(CommonUtils.OFF);
//    	
//    	// UPDATE時の共通設定
//    	entityUtils.setColumns4Insert(customer, customerId);
//    	// UPDATEを実行し、データを登録する
//    	customerMapper.insert(customer);
//    	
//    	// 顧客登録完了メールを送信
//    	mailUtils.sendMail(customer);
//    }
//    
//    /**
//     * 10桁のランダムなパスワードを生成
//     * @return password パスワード
//     */
//    private String createRandomPassword() {
//    	StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz")
//    			.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
//    			.append("0123456789");
//    	
//    	StringBuilder password = new StringBuilder();
//    	Random random = new Random();
//    	
//    	for (int i = 0; i < 10; i++) {
//    		int num = random.nextInt(sb.length());
//    		password.append(sb.charAt(num));
//    	}
//    	
//    	return password.toString();

