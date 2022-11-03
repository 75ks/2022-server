package com.c4c._2022server.service;

import com.c4c._2022server.form.customer.CustomerHomeInitRes;

public interface CustomerHomeService {
    /**
     * 予約、来店履歴情報取得
     * @param customerId 顧客ID
     * @return 予約、来店履歴情報
     */
    public CustomerHomeInitRes index(int customerId);
}
