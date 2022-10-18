package com.c4c._2022server.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
public class StuffCreateReq {
    /**
     * 姓
     */
    @NotEmpty(message = "{lastName}{NotEmpty}")
    @Size(max = 30, message = "{lastName}{Size.less_max}")
    private String lastName;
    /**
     * 名
     */
    @NotEmpty(message = "{firstName}{NotEmpty}")
    @Size(max = 30, message = "{firstName}{Size.less_max}")
    private String firstName;
    /**
     * セイ
     */
    @NotEmpty(message = "{lastNameKana}{NotEmpty}")
    @Size(max = 30, message = "{lastNameKana}{Size.less_max}")
    private String lastNameKana;
    /**
     * メイ
     */
    @NotEmpty(message = "{firstNameKana}{NotEmpty}")
    @Size(max = 30, message = "{firstNameKana}{Size.less_max}")
    private String firstNameKana;
    /**
     * 生年月日
     */
    private String birthday;
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
     * ランク
     */
    @NotNull(message = "{rank}{NotNull}")
    private Integer rankId;
    /**
     * 郵便番号
     */
    @Size(min = 7, max = 7, message = "{postalCode}{Size}")
    private String postalCode;
    /**
     * 都道府県
     */
    private Integer prefectureId;
    /**
     * 市区町村
     */
    private String address1;
    /**
     * 市区町村以下
     */
    private String address2;
    /**
     * 建物、部屋番号
     */
    private String address3;
    /**
     * 電話番号
     */
    @Size(min = 11, max = 11, message = "{phoneNumber}{Size}")
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
}
