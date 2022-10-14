package com.c4c._2022server.form;

import javax.validation.constraints.NotNull;

public class MenuManagementDetailUpdateReq {
	/**
	 * ランクID
	 */
	@NotNull(message = "{rank}{NotNull}")
	private Integer rankId;
	/**
	 * プライス
	 */
	@NotNull(message = "{price}{NotEmpty}")
	private Integer price;
	
	
}