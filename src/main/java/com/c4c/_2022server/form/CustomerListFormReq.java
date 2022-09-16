package com.c4c._2022server.form;

import lombok.Data;

@Data
public class CustomerListFormReq {
    /** 顧客ID */
    private Integer customerId;

    /** 店舗ID */
    private Integer storeId;

    /** 顧客名 */
    private String customerName;
    
    /** 顧客名(カナ) */
    private String customerNameKana;

    /** 年齢 */
    private Integer age;
    
    /** 性別 */
    private Integer gender;
}
