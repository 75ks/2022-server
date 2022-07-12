package com.c4c._2022server.form;

import lombok.Data;

@Data
public class ReserveHistoryReq {
    /** 予約履歴ID */
    private String reserveHistoryId;

    /** 顧客名 */
    private String customerName;

    /** スタッフ名 */
    private String stuffName;

    /** ランク名 */
    private String rankName;

    /** メニュー */
    private String menu;

    /** 料金(下限) */
    private Integer priceMin;

    /** 料金(上限) */
    private Integer priceMax;

    /** 日時(下限) */
    private String reserveDateTimeMin;

    /** 日時(上限) */
    private String reserveDateTimeMax;

    /** 予約状態 */
    private String reserveState;
}
