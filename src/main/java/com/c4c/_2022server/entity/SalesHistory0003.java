package com.c4c._2022server.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class SalesHistory0003 {
    /**
     * Table: SALES_HISTORY
     * Type: INT
     * Remark: 来店履歴ID
     */
    private Integer salesHistoryId;

    /**
     * Table: SALES_HISTORY
     * Type: INT
     * Remark: 予約履歴ID
     */
    private Integer reserveHistoryId;

    /**
     * Table: SALES_HISTORY
     * Type: VARCHAR(255)
     * Remark: ランク
     */
    private String rank;

    /**
     * Table: MENU_HEADER
     * Type: INT
     * Remark: メニューID
     */
    private String menuId;

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
     * Table: SALES_HISTORY
     * Type: INT
     * Remark: 顧客ID
     */
    private Integer customerId;

    /**
     * Table: CUSTOMER
     * Type: VARCHAR(30)
     * Remark: 姓
     */
    private String customerLastName;

    /**
     * Table: CUSTOMER
     * Type: VARCHAR(30)
     * Remark: 名
     */
    private String customerFirstName;

    /**
     * Table: CUSTOMER
     * Type: VARCHAR(30)
     * Remark: セイ
     */
    private String customerLastNameKana;

    /**
     * Table: CUSTOMER
     * Type: VARCHAR(30)
     * Remark: メイ
     */
    private String customerFirstNameKana;

    /**
     * Table: SALES_HISTORY
     * Type: INT
     * Remark: スタッフID
     */
    private Integer stuffId;

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

    /**
     * Table: STUFF
     * Type: VARCHAR(30)
     * Remark: セイ
     */
    private String stuffLastNameKana;

    /**
     * Table: STUFF
     * Type: VARCHAR(30)
     * Remark: メイ
     */
    private String stuffFirstNameKana;
}
