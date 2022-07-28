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
}
