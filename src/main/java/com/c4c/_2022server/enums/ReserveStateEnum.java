package com.c4c._2022server.enums;

import java.util.Arrays;
import java.util.Objects;

public enum ReserveStateEnum implements EnumBase {
    RESERVED(1, "予約済"),
    VISITED(2, "来店済"),
    CHANGE(3, "予約日時変更"),
    CANCEL(4, "キャンセル");

    private final Integer code;
    private final String name;

    ReserveStateEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public static ReserveStateEnum getEnumByCode(Integer code) {
        return Arrays.stream(values())
                .filter(enumeration -> Objects.equals(enumeration.code, code))
                .findFirst()
                .orElse(null);
    }
}
