package com.c4c._2022server.form;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.Data;
@Data
public class MenuManagementMenuIdUpdateReq {
	/**
	 * メニューID
	 */
	@NotNull(message = "{menu}{NotNull}")
	private Integer menuId;
	
	private List<MenuManagementDetailUpdateReq> detail;
}
