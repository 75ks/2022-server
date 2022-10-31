package com.c4c._2022server.form;

import lombok.Data;

@Data
public class MenuManagementCreate {
    /**
     * Column: MENU_ID
     * Type: INT
     * Remark: メニューID
     */
    private Integer menuId;

    /**
     * Column: MENU
     * Type: VARCHAR(255)
     * Remark: メニュー
     */
    private String menu;

}
