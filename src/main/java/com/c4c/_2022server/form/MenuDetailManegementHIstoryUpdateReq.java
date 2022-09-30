package com.c4c._2022server.form;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class MenuDetailManegementHIstoryUpdateReq {
    /**
     * メニューID
     */
    @NotNull(message = "{menu}{NotNull}")
    private Integer menuId;
    /**
     * ランクID
     */
    @NotNull(message = "{rank}{NotNull}")
    private Integer rankId;
    /**
     * プライス
     */ 
    @NotNull(message = "{price}{NotEmpty}")
    private Integer price;
}
