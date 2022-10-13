package com.c4c._2022server.service;

import com.c4c._2022server.form.CustomerDetailReq;

public interface CustomerDetailService {
	/**
	 * 
	 * @param userId
	 * @param reqForm
	 */
    public void resForm(int userId, CustomerDetailReq reqForm);

}
