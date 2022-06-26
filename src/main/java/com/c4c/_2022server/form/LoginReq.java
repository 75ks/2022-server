package com.c4c._2022server.form;

import lombok.Data;

@Data
public class LoginReq {
    /**
     * メールアドレス
     */
    private String email;

    /**
     * パスワード
     */
    private String password;
}
