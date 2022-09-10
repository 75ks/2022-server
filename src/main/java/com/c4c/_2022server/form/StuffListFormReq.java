package com.c4c._2022server.form;

import lombok.Data;

@Data
public class StuffListFormReq {
    /** スタッフID */
    private Integer stuffId;

    /** 店舗ID */
    private Integer storeId;

    /** スタッフ名 */
    private String stuffName;
    
    /** スタッフ仮名 */
    private String stuffNameKana;

    /** ランク名 */
    private String rankName;

    /** 年齢 */
    private Integer age;
    
    /** 性別 */
    private Integer gender;
}
