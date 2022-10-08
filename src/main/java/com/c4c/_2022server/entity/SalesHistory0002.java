package com.c4c._2022server.entity;

import lombok.Data;

@Data
public class SalesHistory0002 {
    /**
     * Table: SALES_HISTORY
     * Type: INT
     * Remark: 来店人数
     */
    private Integer numberOfVisitors;

    /**
     * Table: SALES_HISTORY
     * Column: PRICE
     * Type: INT
     * Remark: 売上金額
     */
    private Integer salesAmount;

    /**
     * Table: SALES_HISTORY
     * Column: PRICE
     * Type: INT
     * Remark: 平均金額
     */
    private Integer averageAmount;
}
