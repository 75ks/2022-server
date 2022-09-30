package com.c4c._2022server.form;

import lombok.Data;
@Data
public class MenuDetailManagementRes {
    /**
     * Column: MENU_ID
     * Type: INT
     * Remark: メニューID
     */
    private Integer menuId;

    /**
     * Column: RANK_ID
     * Type: INT
     * Remark: ランクID
     */
    private Integer rankId;

    /**
     * Column: PRICE
     * Type: INT
     * Remark: 料金
     */
    private Integer price;
}
