package com.c4c._2022server.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ReserveRegisterReq {
    /**
     * スタッフID
     */
    @NotNull(message = "{stuff}{NotNull}")
    private Integer stuffId;

    /**
     * メニューID
     */
    @NotNull(message = "{menu}{NotNull}")
    private Integer menuId;

    /**
     * 予約日時
     */
    @NotEmpty(message = "{reserveDateTime}{NotEmpty}")
    private String reserveDateTime;
}
