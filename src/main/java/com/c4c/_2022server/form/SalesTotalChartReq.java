package com.c4c._2022server.form;

import lombok.Data;

@Data
public class SalesTotalChartReq {
    /**
     * 来店年
     */
    private String salesYear;

    /**
     * 1月(絞り込み用)
     */
    private String january;

    /**
     * 2月(絞り込み用)
     */
    private String february;

    /**
     * 3月(絞り込み用)
     */
    private String march;

    /**
     * 4月(絞り込み用)
     */
    private String april;

    /**
     * 5月(絞り込み用)
     */
    private String may;

    /**
     * 6月(絞り込み用)
     */
    private String june;

    /**
     * 7月(絞り込み用)
     */
    private String july;

    /**
     * 8月(絞り込み用)
     */
    private String august;

    /**
     * 9月(絞り込み用)
     */
    private String september;

    /**
     * 10月(絞り込み用)
     */
    private String october;

    /**
     * 11月(絞り込み用)
     */
    private String november;

    /**
     * 12月(絞り込み用)
     */
    private String december;
}
