package com.c4c._2022server.entity;

import lombok.Data;

@Data
public class MenuHeader0001 {
    /**
     * Table: MENU_HEADER
     * Column: MENU_ID
     * Type: INT
     * Remark: メニューID
     */
    private Integer menuId;

    /**
     * Table: MENU_HEADER
     * Column: MENU
     * Type: VARCHAR(255)
     * Remark: メニュー
     */
    private String menu;

    /**
     * Table: MENU_DETAIL
     * Column: PRICE
     * Type: INT
     * Remark: 料金
     */
    private Integer price;
}
