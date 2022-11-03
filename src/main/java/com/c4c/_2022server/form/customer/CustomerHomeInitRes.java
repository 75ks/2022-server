package com.c4c._2022server.form.customer;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CustomerHomeInitRes {
    /**
     * Table: MENU_HEADER
     * Column: MENU
     * Type: VARCHAR(255)
     * Remark: メニュー
     */
    private String menu;

    /**
     * Table: MENU_DETAIL
     * Column: PRICE
     * Type: INT
     * Remark: 料金
     */
    private Integer price;

    /**
     * Column: RESERVE_DATETIME
     * Type: TIMESTAMP
     * Remark: 予約日時
     */
    private LocalDateTime reserveDatetime;

    /**
     * Table: STUFF
     * Column: LAST_NAME
     * Type: VARCHAR(30)
     * Remark: 姓
     */
    private String stuffLastName;

    /**
     * Table: STUFF
     * Column: FIRST_NAME
     * Type: VARCHAR(30)
     * Remark: 名
     */
    private String stuffFirstName;
}
