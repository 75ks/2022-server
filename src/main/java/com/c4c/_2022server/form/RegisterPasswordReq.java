package com.c4c._2022server.form;

import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class RegisterPasswordReq {
    /**
     * パスワード
     */
    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[0-9])[a-zA-Z0-9.?/-]{5,}$", message = "{Pattern.password}")
    private String password;
}
