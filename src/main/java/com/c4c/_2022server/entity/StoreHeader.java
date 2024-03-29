package com.c4c._2022server.entity;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * Table: STORE_HEADER
 */
@Data
public class StoreHeader {
    /**
     * Column: STORE_ID
     * Type: INT
     * Remark: 店舗ID
     */
    private Integer storeId;

    /**
     * Column: STORE_NAME
     * Type: VARCHAR(255)
     * Remark: 店舗名
     */
    private String storeName;

    /**
     * Column: POSTAL_CODE
     * Type: VARCHAR(7)
     * Remark: 郵便番号
     */
    private String postalCode;

    /**
     * Column: PREFECTURE_ID
     * Type: INT
     * Remark: 都道府県
     */
    private Integer prefectureId;

    /**
     * Column: ADDRESS1
     * Type: VARCHAR(45)
     * Remark: 住所1
     */
    private String address1;

    /**
     * Column: ADDRESS2
     * Type: VARCHAR(45)
     * Remark: 住所2
     */
    private String address2;

    /**
     * Column: ADDRESS3
     * Type: VARCHAR(45)
     * Remark: 住所3
     */
    private String address3;

    /**
     * Column: PHONE_NUMBER
     * Type: VARCHAR(11)
     * Remark: 電話番号
     */
    private String phoneNumber;

    /**
     * Column: EMAIL
     * Type: VARCHAR(255)
     * Remark: メールアドレス
     */
    private String email;

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