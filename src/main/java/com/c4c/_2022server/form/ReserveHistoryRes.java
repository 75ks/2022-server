package com.c4c._2022server.form;

import java.util.Date;

import lombok.Data;

@Data
public class ReserveHistoryRes {
    /**
     * Table: RESERVE_HISTORY
     * Column: RESERVE_HISTORY_ID
     * Type: INT
     * Remark: 予約履歴ID
     */
    private Integer reserveHistoryId;

    /**
     * Table: RESERVE_HISTORY
     * Column: RANK
     * Type: VARCHAR(255)
     * Remark: ランク
     */
    private String rank;

    /**
     * Table: RESERVE_HISTORY
     * Column: MENU
     * Type: VARCHAR(255)
     * Remark: メニュー
     */
    private String menu;

    /**
     * Table: RESERVE_HISTORY
     * Column: PRICE
     * Type: INT
     * Remark: 料金
     */
    private Integer price;

    /**
     * Table: RESERVE_HISTORY
     * Column: RESERVE_DATETIME
     * Type: TIMESTAMP
     * Remark: 予約日時
     */
    private Date reserveDatetime;

    /**
     * Table: RESERVE_HISTORY
     * Column: RESERVE_STATE
     * Type: INT
     * Remark: 予約状態
     * 上記を元に予約状態名を保持する
     */
    private String reserveState;

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
