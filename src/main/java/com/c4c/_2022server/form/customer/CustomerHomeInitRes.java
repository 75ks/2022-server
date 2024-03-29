package com.c4c._2022server.form.customer;

import java.util.List;

import lombok.Data;

@Data
public class CustomerHomeInitRes {
    /**
     * Table: RESERVE_HISTORY
     * Remark: 予約情報
     */
    private CustomerHomeReserveRes customerHomeReserve;

    /**
     * Table: SALES_HISTORY
     * Remark: 来店履歴情報
     */
    private List<CustomerHomeSalesRes> customerHomeSalesList;
}
