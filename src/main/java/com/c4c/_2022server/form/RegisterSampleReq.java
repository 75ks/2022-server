package com.c4c._2022server.form;

import lombok.Data;

@Data
public class RegisterSampleReq {
    /**
     * 店舗名
     */
    private String storeId;
    /**
     * 姓
     */
    private String lastName;
    /**
     * 名
     */
    private String firstName;
    /**
     * セイ
     */
    private String lastNameKana;
    /**
     * メイ
     */
    private String firstNameKana;
    /**
     * ランク
     */
    private String rank;
    /**
     * 性別 
     */
    private String gender;
    /**
     * メールアドレス
     */
    private String email;
    /**
     * パスワード
     */
    private String password;
}
