package com.c4c._2022server.form;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class SalesHistoryRes {
    /**
     * Table: SALES_HISTORY
     * Column: SALES_HISTORY_ID
     * Type: INT
     * Remark: 来店履歴ID
     */
    private Integer salesHistoryId;

    /**
     * Table: SALES_HISTORY
     * Column: RESERVE_HISTORY_ID
     * Type: INT
     * Remark: 予約履歴ID
     */
    private Integer reserveHistoryId;

    /**
     * Table: SALES_HISTORY
     * Column: RANK
     * Type: VARCHAR(255)
     * Remark: ランク
     */
    private String rank;

    /**
     * Table: MENU_HEADER
     * Column: MENU_ID
     * Type: INT
     * Remark: メニューID
     */
    private String menuId;

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
     * Table: SALES_HISTORY
     * Column: CUSTOMER_ID
     * Type: INT
     * Remark: 顧客ID
     */
    private Integer customerId;

    /**
     * Table: CUSTOMER
     * Column: LAST_NAME
     * Type: VARCHAR(30)
     * Remark: 姓
     */
    private String customerLastName;

    /**
     * Table: CUSTOMER
     * Column: FIRST_NAME
     * Type: VARCHAR(30)
     * Remark: 名
     */
    private String customerFirstName;

    /**
     * Table: CUSTOMER
     * Column: LAST_NAME_KANA
     * Type: VARCHAR(30)
     * Remark: セイ
     */
    private String customerLastNameKana;

    /**
     * Table: CUSTOMER
     * Column: FIRST_NAME_KANA
     * Type: VARCHAR(30)
     * Remark: メイ
     */
    private String customerFirstNameKana;

    /**
     * Table: SALES_HISTORY
     * Column: STUFF_ID
     * Type: INT
     * Remark: スタッフID
     */
    private Integer stuffId;

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

    /**
     * Table: STUFF
     * Column: LAST_NAME_KANA
     * Type: VARCHAR(30)
     * Remark: セイ
     */
    private String stuffLastNameKana;

    /**
     * Table: STUFF
     * Column: FIRST_NAME_KANA
     * Type: VARCHAR(30)
     * Remark: メイ
     */
    private String stuffFirstNameKana;
}
