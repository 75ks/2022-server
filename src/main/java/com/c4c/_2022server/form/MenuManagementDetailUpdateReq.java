package com.c4c._2022server.form;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class MenuManagementDetailUpdateReq {
	/**
	 * ランクId
	 */
	@NotNull(message = "{rankId}{NotEmpty}")
	private Integer rankId;

	/**
	 * プライス
	 */
	@NotNull(message = "{price}{NotEmpty}")
	private Integer price;

}