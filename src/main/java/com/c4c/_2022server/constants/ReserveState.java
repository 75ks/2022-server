package com.c4c._2022server.constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReserveState {
    /**
     * 予約状態リスト
     */
    public static final List<String> LIST;
        static {
            List<String> reserveStateList = new ArrayList<>();
            reserveStateList.add("予約済");
            reserveStateList.add("来店済");
            reserveStateList.add("予約日時変更");
            reserveStateList.add("キャンセル");
            // オブジェクトに対してfinalを付ける場合、別のオブジェクトの参照を代入することができなくなるが、
            // 要素の追加や変更が可能なため、下記で無効化する
            LIST = Collections.unmodifiableList(reserveStateList);
        }
}
