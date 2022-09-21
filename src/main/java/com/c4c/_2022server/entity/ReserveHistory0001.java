package com.c4c._2022server.entity;

import java.util.Date;

import com.c4c._2022server.enums.ReserveStateEnum;

import lombok.Data;

@Data
public class ReserveHistory0001 {
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
     * Table: MENU_HEADER
     * Column: MENU_ID
     * Type: INT
     * Remark: メニューID
     */
    private String menuId;

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
     */
    private Integer reserveState;

    /**
     * Table: CUSTOMER
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
     * Table: STUFF
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

    /**
     * 予約状態に紐づく名称を取得します
     * @return 予約状態名称
     */
    public String getReserveStateName() {
        return ReserveStateEnum.getEnumByCode(this.reserveState).getName();
    }

    /**
     * Table: SALES_HISTORY
     * Column: SALES_HISTORY_ID
     * Type: INT
     * Remark: 来店履歴ID
     */
    private Integer salesHistoryId;
}
