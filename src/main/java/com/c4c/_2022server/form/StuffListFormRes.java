package com.c4c._2022server.form;

import java.util.Date;

import lombok.Data;

@Data
public class StuffListFormRes {
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

    /**
     * Table: STUFF
     * Column: POSTAL_CODE
     * Type: VARCHAR(7)
     * Remark: 郵便番号
     */
    private String postalCode;

    /**
     * Table: STUFF
     * Column: PREFECTURE_ID
     * Type: INT
     * Remark: 都道府県
     */
    private Integer prefectureId;

    /**
     * Table: STUFF
     * Column: ADDRESS1
     * Type: VARCHAR(45)
     * Remark: 住所1
     */
    private String address1;

    /**
     * Table: STUFF
     * Column: ADDRESS2
     * Type: VARCHAR(45)
     * Remark: 住所2
     */
    private String address2;

    /**
     * Table: STUFF
     * Column: ADDRESS3
     * Type: VARCHAR(45)
     * Remark: 住所3
     */
    private String address3;

    /**
     * Table: STUFF
     * Column: PHONE_NUMBER
     * Type: VARCHAR(11)
     * Remark: 電話番号
     */
    private String phoneNumber;

    /**
     * Table: STUFF
     * Column: EMAIL
     * Type: VARCHAR(255)
     * Remark: メールアドレス
     */
    private String email;
}
