package com.c4c._2022server.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ReserveState {
    /**
     * 予約状態
     */
    public static final Map<Integer, String> MAP;
        static {
            Map<Integer, String> reserveStateMap = new HashMap<>();
            reserveStateMap.put(1, "予約済");
            reserveStateMap.put(2, "来店済");
            reserveStateMap.put(3, "予約日時変更");
            reserveStateMap.put(4, "キャンセル");
            // オブジェクトに対してfinalを付ける場合、別のオブジェクトの参照を代入することができなくなるが、
            // 要素の追加や変更が可能なため、下記で無効化する
            MAP = Collections.unmodifiableMap(reserveStateMap);
        }
}
