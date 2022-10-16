package com.c4c._2022server.service;

import com.c4c._2022server.form.CustomerDetailRes;

public interface CustomerDetailService {
	/**
	 * 
	 * @param storeId
	 * @param customerId
	 * @return
	 */
    public CustomerDetailRes index(int storeId, int customerId);

}
