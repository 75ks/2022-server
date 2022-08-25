package com.c4c._2022server.entity;

import lombok.Data;

@Data
public class ReserveHistory0002 {
    /**
     * Table: RANK_BY_STORE
     * Column: RANK
     * Type: VARCHAR(255)
     * Remark: ランク
     */
    private String rank;

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
