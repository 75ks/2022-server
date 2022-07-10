package com.c4c._2022server.form;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class RegisterSampleReq {
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
     * ランク
     */
    @NotEmpty(message = "{rank}{NotEmpty}")
    private Integer rankId;
    /**
     * 性別
     */
    @NotEmpty(message = "{gender}{NotEmpty}")
    private String gender;
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
