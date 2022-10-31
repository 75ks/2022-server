package com.c4c._2022server.enums;

import java.util.Arrays;
import java.util.Objects;

public enum NumberOfDisplayEnum implements EnumBase {
    TEN(10, "10件"),
    FIFTEEN(15, "15件"),
    TWENTY(20, "20件"),
    TWENTYFIVE(25, "25件"),
    THIRTY(30, "30件");

    private final Integer code;
    private final String name;

    NumberOfDisplayEnum(Integer code, String name) {
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

    public static NumberOfDisplayEnum getEnumByCode(Integer code) {
        return Arrays.stream(values())
                .filter(enumeration -> Objects.equals(enumeration.code, code))
                .findFirst()
                .orElse(null);
    }
}
