package com.c4c._2022server.entity;

import java.util.Date;

import lombok.Data;

/**
 * Table: RESERVE_HISTORY
 */
@Data
public class ReserveHistory {
    /**
     * Column: RESERVE_HISTORY_ID
     * Type: INT
     * Remark: 予約履歴ID
     */
    private Integer reserveHistoryId;

    /**
     * Column: STORE_ID
     * Type: INT
     * Remark: 店舗ID
     */
    private Integer storeId;

    /**
     * Column: CUSTOMER_ID
     * Type: INT
     * Remark: 顧客ID
     */
    private Integer customerId;

    /**
     * Column: STUFF_ID
     * Type: INT
     * Remark: スタッフID
     */
    private Integer stuffId;

    /**
     * Column: RANK
     * Type: VARCHAR(255)
     * Remark: ランク
     */
    private String rank;

    /**
     * Column: MENU
     * Type: VARCHAR(255)
     * Remark: メニュー
     */
    private String menu;

    /**
     * Column: PRICE
     * Type: INT
     * Remark: 料金
     */
    private Integer price;

    /**
     * Column: RESERVE_DATETIME
     * Type: TIMESTAMP
     * Remark: 予約日時
     */
    private Date reserveDatetime;

    /**
     * Column: RESERVE_STATE
     * Type: INT
     * Remark: 予約状態
     */
    private Integer reserveState;

    /**
     * Column: DELETE_FLG
     * Type: INT
     * Default value: 0
     * Remark: 削除フラグ
     */
    private Integer deleteFlg;

    /**
     * Column: CREATED_DATETIME
     * Type: TIMESTAMP
     * Remark: 作成日時
     */
    private Date createdDatetime;

    /**
     * Column: CREATED_USER
     * Type: INT
     * Remark: 作成者ID
     */
    private Integer createdUser;

    /**
     * Column: UPDATE_DATETIME
     * Type: TIMESTAMP
     * Remark: 更新日時
     */
    private Date updateDatetime;

    /**
     * Column: UPDATE_USER
     * Type: INT
     * Remark: 更新者ID
     */
    private Integer updateUser;

    /**
     * Column: VERSION_EX_KEY
     * Type: INT
     * Default value: 0
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}