package com.c4c._2022server.form;

import lombok.Data;

@Data
public class SalesTotalYearRes {
    /**
     * Table: SALES_HISTORY
     * Column: SALES_DATETIME
     * Type: VARCHAR(255)
     * Remark: 売上月
     */
    private String salesMonth;

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
