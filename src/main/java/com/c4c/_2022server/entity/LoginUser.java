package com.c4c._2022server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginUser {
    /**
     * Type: INT
     * Remark: ID
     */
    private Integer id;

    /**
     * Type: INT
     * Remark: 店舗ID
     */
    private Integer storeId;

    /**
     * Type: INT
     * Remark: 認証タイプ
     * (1: スタッフ, 2: 顧客)
     */
    private Integer authenticationType;
}
