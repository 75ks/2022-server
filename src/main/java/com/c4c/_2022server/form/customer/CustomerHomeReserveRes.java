package com.c4c._2022server.form.customer;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CustomerHomeReserveRes {
    /**
     * Table: RESERVE_HISTORY
     * Column: MENU
     * Type: VARCHAR(255)
     * Remark: メニュー
     */
    private String menu;

    /**
     * Table: RESERVE_HISTORY
     * Column: PRICE
     * Type: INT
     * Remark: 料金
     */
    private Integer price;

    /**
     * Table: RESERVE_HISTORY
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
