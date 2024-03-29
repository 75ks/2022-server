package com.c4c._2022server.entity;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * Table: MENU_DETAIL
 */
@Data
public class MenuDetail {
    /**
     * Column: STORE_ID
     * Type: INT
     * Remark: 店舗ID
     */
    private Integer storeId;

    /**
     * Column: MENU_ID
     * Type: INT
     * Remark: メニューID
     */
    private Integer menuId;

    /**
     * Column: RANK_ID
     * Type: INT
     * Remark: ランクID
     */
    private Integer rankId;

    /**
     * Column: PRICE
     * Type: INT
     * Remark: 料金
     */
    private Integer price;

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
    private LocalDateTime createdDatetime;

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
    private LocalDateTime updateDatetime;

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