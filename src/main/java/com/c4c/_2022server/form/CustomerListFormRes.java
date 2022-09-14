package com.c4c._2022server.form;

import java.util.Date;

import lombok.Data;

@Data
public class CustomerListFormRes {
	/**
	 * Table: CUSTOMER
     * Column: CUSTOMER_ID
     * Type: INT
     * Remark: 顧客ID
     */
    private Integer customerId;

    /**
     * Table: CUSTOMER
     * Column: STORE_ID
     * Type: INT
     * Remark: 店舗ID
     */
    private Integer storeId;

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
     * Column: RANK
     * Type: VARCHAR(255)
     * Remark: ランク
     */
    private String rank;

    /**
     * Table: CUSTOMER
     * Column: BIRTHDAY
     * Type: DATE
     * Remark: 生年月日
     */
    private Date birthday;

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
}
