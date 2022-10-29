package com.c4c._2022server.form;

import lombok.Data;

@Data
public class MenuManagementCreateReq {
    /**
     * Column: MENU_ID
     * Type: INT
     * Remark: メニューID
     */
    private Integer menuId;

    /**
     * Column: MENU
     * Type: VARCHAR(255)
     * Remark: メニュー
     */
    private String menu;
//    /**
//     * Column: RANK_ID
//     * Type: INT
//     * Remark: ランクID
//     */
//    private Integer rankId;
//
//    /**
//     * Column: RANK
//     * Type: VARCHAR(255)
//     * Remark: ランク
//     */
//    private String rank;

}
