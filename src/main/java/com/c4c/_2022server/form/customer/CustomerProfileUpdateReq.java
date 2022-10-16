package com.c4c._2022server.form.customer;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CustomerProfileUpdateReq {
    /** 顧客ID */
    private Integer customerId;

    /** 顧客名 */
    private String customerName;
    private String lastName;
    private String firstName;


    /** 顧客名(カナ) */
    private String customerNameKana;
    private String lastNameKana;
    private String firstNameKana;

    private LocalDate birthday;

    /** 年齢 */
    private Integer age;

    /** 性別 */
    private Integer gender;

    /** 郵便番号 */
    private String postalCode;

    /** 都道府県 */
    private Integer prefectureId;

    /** 市区町村 */
    private String address1;

    /** 市区町村以下 */
    private String address2;

    /** 建物、部屋番号 */
    private String address3;

    /** 電話番号 */
    private String phoneNumber;

    /** メールアドレス */
    private String email;

    /** 排他制御カラム */
    private Integer versionExKey;
}
