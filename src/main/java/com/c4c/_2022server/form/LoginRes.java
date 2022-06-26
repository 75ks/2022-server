package com.c4c._2022server.form;

import lombok.Data;

@Data
public class LoginRes {
    /**
     * スタッフID
     */
    private Integer stuffId;

    /**
     * JWT
     */
    private String jwt;
}
