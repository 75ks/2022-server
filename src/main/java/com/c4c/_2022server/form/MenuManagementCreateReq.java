package com.c4c._2022server.form;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class MenuManagementCreateReq {
	/**
	 * Column: MENU_ID Type: INT Remark: メニューID
	 */
	private Integer menuId;

	/**
	 * Column: MENU Type: VARCHAR(255) Remark: メニュー
	 */
	@NotEmpty(message = "{menu}{NotEmpty}")
	private String menu;
}
