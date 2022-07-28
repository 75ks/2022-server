package com.c4c._2022server.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class CustomerCreateReq {
    /**
     * 店舗名
     */
    @NotEmpty(message = "{storeId}{NotEmpty}")
    private String storeId;
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
    @NotNull(message = "{birthday}{NotNull}")
    private Date birthday;
    /**
     * 年齢
     */
    @NotEmpty(message = "{age}{NotNull}")
    private String age;
    /**
     * 性別
     */
    @NotEmpty(message = "{gender}{NotEmpty}")
    private String gender;
    /**
     * 郵便番号
     */
    @NotEmpty(message = "{postalCode}{NotNull}")
    private String postalCode;
    /**
     * 都道府県
     */
    @NotEmpty(message = "{prefectureId}{NotNull}")
    private String prefectureId;
    /**
     * 市区町村
     */
    @NotEmpty(message = "{address1}{NotNull}")
    private String address1;
    /**
     * 市区町村以下
     */
    @NotEmpty(message = "{address2}{NotNull}")
    private String address2;
    /**
     * 建物、部屋番号
     */
    @NotEmpty(message = "{address3}{NotNull}")
    private String address3;
    /**
     * 電話番号
     */
    @NotEmpty(message = "{phoneNumber}{NotNull}")
    private String phoneNumber;
    /**
     * メールアドレス
     */
    @NotEmpty(message = "{email}{NotEmpty}")
    private String email;
    /**
     * パスワード
     */
    @NotEmpty(message = "{password}{NotEmpty}")
    private String password;
//    private String email;
}
