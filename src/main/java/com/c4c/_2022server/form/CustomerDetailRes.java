package com.c4c._2022server.form;

import java.time.LocalDate;

import lombok.Data;

@Data
public class CustomerDetailRes {
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
    private String lastName;

    /**
     * Table: CUSTOMER
     * Column: FIRST_NAME
     * Type: VARCHAR(30)
     * Remark: 名
     */
    private String firstName;

    /**
     * Table: CUSTOMER
     * Column: LAST_NAME_KANA
     * Type: VARCHAR(30)
     * Remark: セイ
     */
    private String lastNameKana;

    /**
     * Table: CUSTOMER
     * Column: FIRST_NAME_KANA
     * Type: VARCHAR(30)
     * Remark: メイ
     */
    private String firstNameKana;

    /**
     * Table: CUSTOMER
     * Column: BIRTHDAY
     * Type: DATE
     * Remark: 生年月日
     */
    private LocalDate birthday;

    /**
     * Table: CUSTOMER
     * Column: AGE
     * Type: INT
     * Remark: 年齢
     */
    private Integer age;

    /**
     * Table: CUSTOMER
     * Column: GENDER
     * Type: INT
     * Remark: 性別
     */
    private Integer gender;
    /**
     * Table: CUSTOMER
     * Column: POSTAL_CODE
     * Type: VARCHAR(7)
     * Remark: 郵便番号
     */
    private String postalCode;
    /**
     * Table: CUSTOMER
     * Column: PREFECTURE_ID
     * Type: INT
     * Remark: 都道府県
     */
    private Integer prefectureId;
    /**
     * Table: CUSTOMER
     * Column: ADDRESS1
     * Type: VARCHAR(45)
     * Remark: 住所1
     */
    private String address1;
    /**
     * Table: CUSTOMER
     * Column: ADDRESS2
     * Type: VARCHAR(45)
     * Remark: 住所2
     */
    private String address2;
    /**
     * Table: CUSTOMER
     * Column: ADDRESS3
     * Type: VARCHAR(45)
     * Remark: 住所3
     */
    private String address3;
    /**
     * Table: CUSTOMER
     * Column: PHONE_NUMBER
     * Type: VARCHAR(11)
     * Remark: 電話番号
     */
    private String phoneNumber;
    /**
     * Table: CUSTOMER
     * Column: EMAIL
     * Type: VARCHAR(255)
     * Remark: メールアドレス
     */
    private String email;
    
    /**
     * Column: VERSION_EX_KEY
     * Type: INT
     * Default value: 0
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}