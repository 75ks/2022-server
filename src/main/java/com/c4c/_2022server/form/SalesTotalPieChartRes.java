package com.c4c._2022server.form;

import lombok.Data;

@Data
public class SalesTotalPieChartRes {
    /**
     * Table: SALES_HISTORY
     * Column: MENU
     * Type: VARCHAR(255)
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
