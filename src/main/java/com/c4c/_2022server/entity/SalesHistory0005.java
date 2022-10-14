package com.c4c._2022server.entity;

import lombok.Data;

@Data
public class SalesHistory0005 {
    /**
     * Table: SALES_HISTORY
     * Type: INT
     * Remark: メニュー
     */
    private String menu;

    /**
     * Table: SALES_HISTORY
     * Type: INT
     * Remark: 注文数
     */
    private Integer numberOfOrders;
}
