package com.c4c._2022server.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class SalesHistory0006 {

    /**
     * Table: SALES_HISTORY
     * Type: VARCHAR(255)
     * Remark: メニュー
     */
    private String menu;

    /**
     * Table: SALES_HISTORY
     * Type: INT
     * Remark: 料金
     */
    private Integer price;

    /**
     * Table: SALES_HISTORY
     * Type: TIMESTAMP
     * Remark: 来店日時
     */
    private LocalDateTime salesDatetime;

    /**
     * Table: STUFF
     * Type: VARCHAR(30)
     * Remark: 姓
     */
    private String stuffLastName;

    /**
     * Table: STUFF
     * Type: VARCHAR(30)
     * Remark: 名
     */
    private String stuffFirstName;
}
