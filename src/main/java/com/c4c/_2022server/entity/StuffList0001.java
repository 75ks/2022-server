package com.c4c._2022server.entity;

import java.util.Date;

import lombok.Data;

@Data
public class StuffList0001 {
    /**
     * Table: STUFF
     * Column: STUFF_ID
     * Type: INT
     * Remark: スタッフID
     */
    private Integer stuffId;

    /**
     * Table: STUFF
     * Column: STORE_ID
     * Type: INT
     * Remark: 店舗ID
     */
    private Integer storeId;

    /**
     * Table: STUFF
     * Column: LAST_NAME
     * Type: VARCHAR(30)
     * Remark: 姓
     */
    private String lastName;

    /**
     * Table: STUFF
     * Column: FIRST_NAME
     * Type: VARCHAR(30)
     * Remark: 名
     */
    private String firstName;

    /**
     * Table: STUFF
     * Column: LAST_NAME_KANA
     * Type: VARCHAR(30)
     * Remark: セイ
     */
    private String lastNameKana;

    /**
     * Table: STUFF
     * Column: FIRST_NAME_KANA
     * Type: VARCHAR(30)
     * Remark: メイ
     */
    private String firstNameKana;

    /**
     * Column: RANK_ID
     * Type: INT
     * Remark: ランクID
     */
    private Integer rankId;

    /**
     * Table: STUFF
     * Column: RANK
     * Type: VARCHAR(255)
     * Remark: ランク
     */
    private String rank;

    /**
     * Table: STUFF
     * Column: BIRTHDAY
     * Type: DATE
     * Remark: 生年月日
     */
    private Date birthday;

    /**
     * Table: STUFF
     * Column: AGE
     * Type: INT
     * Remark: 年齢
     */
    private Integer age;

    /**
     * Table: STUFF
     * Column: GENDER
     * Type: INT
     * Remark: 性別
     */
    private Integer gender;
}
