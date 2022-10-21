package com.c4c._2022server.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class CustomerDetailRegisterReq {
    /**
     * 顧客ID
     */
    private Integer customerId;

    /**
     * 姓
     */
    @NotEmpty(message = "{lastName}{NotEmpty}")
    private String lastName;

    /**
     * 名
     */
    @NotEmpty(message = "{firstName}{NotEmpty}")
    private String firstName;

    /**
     * セイ
     */
    @NotEmpty(message = "{lastNameKana}{NotEmpty}")
    private String lastNameKana;

    /**
     * メイ
     */
    @NotEmpty(message = "{firstNameKana}{NotEmpty}")
    private String firstNameKana;

    /**
     * 生年月日
     */
    private LocalDate birthday;

    /**
     * 年齢
     */
    private Integer age;

    /**
     * 性別
     */
    @NotNull(message = "{gender}{NotNull}")
    private Integer gender;

    /**
     * 郵便番号
     */
    private String postalCode;

    /**
     * 都道府県
     */
    private Integer prefectureId;

    /**
     * 住所1
     */
    private String address1;

    /**
     * 住所2
     */
    private String address2;

    /**
     * 住所3
     */
    private String address3;

    /**
     * 電話番号
     */
    private String phoneNumber;

    /**
     * メールアドレス
     */
    @NotEmpty(message = "{email}{NotEmpty}")
    private String email;
}