package com.c4c._2022server.form.customer;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CustomerHomeSalesRes {
    /**
     * Table: SALES_HISTORY
     * Column: MENU
     * Type: VARCHAR(255)
     * Remark: メニュー
     */
    private String menu;

    /**
     * Table: SALES_HISTORY
     * Column: PRICE
     * Type: INT
     * Remark: 料金
     */
    private Integer price;

    /**
     * Table: SALES_HISTORY
     * Column: SALES_DATETIME
     * Type: TIMESTAMP
     * Remark: 来店日時
     */
    private LocalDateTime salesDatetime;

    /**
     * Table: STUFF
     * Column: LAST_NAME
     * Type: VARCHAR(30)
     * Remark: 姓
     */
    private String stuffLastName;

    /**
     * Table: STUFF
     * Column: FIRST_NAME
     * Type: VARCHAR(30)
     * Remark: 名
     */
    private String stuffFirstName;
}
