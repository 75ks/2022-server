package com.c4c._2022server.form;

import java.util.List;

import lombok.Data;
@Data
public class MenuDetailManagementRes {
    /**
     * Column: MENU_ID
     * Type: INT
     * Remark: メニューID
     */
    private Integer menuId;
    
    
    private List<MenuDetailRes> detail;


	public void setRankId(Integer rankId) {
		// TODO 自動生成されたメソッド・スタブ
		
	}


	public void setPrice(Integer price) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
