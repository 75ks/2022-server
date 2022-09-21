package com.c4c._2022server.form;

import lombok.Data;

@Data
public class LoginRes {
    /**
     * ID
     */
    private Integer id;

    /**
     * JWT
     */
    private String jwt;

    /**
     * 認証タイプ
     * (1: スタッフ, 2: 顧客)
     */
    private Integer authenticationType;

    /**
     * 初回ログインフラグ
     */
    private Integer firstLoginFlg;
}
