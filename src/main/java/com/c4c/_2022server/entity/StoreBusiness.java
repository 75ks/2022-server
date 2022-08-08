package com.c4c._2022server.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import lombok.Data;

/**
 * Table: STORE_BUSINESS
 */
@Data
public class StoreBusiness {
    /**
     * Column: STORE_ID
     * Type: INT
     * Remark: 店舗ID
     */
    private Integer storeId;

    /**
     * Column: WEEKS
     * Type: INT
     * Remark: 週
     */
    private Integer weeks;

    /**
     * Column: DAY_OF_WEEK
     * Type: INT
     * Remark: 曜日
     */
    private Integer dayOfWeek;

    /**
     * Column: BUSINESS_START
     * Type: TIME
     * Remark: 営業開始時間
     */
    private LocalTime businessStart;

    /**
     * Column: BUSINESS_END
     * Type: TIME
     * Remark: 営業終了時間
     */
    private LocalTime businessEnd;

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