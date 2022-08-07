package com.c4c._2022server.enums;

import java.util.Arrays;
import java.util.Objects;

public enum GenderEnum implements EnumBase {
    MALE(1, "男"),
    FEMALE(2, "女"),
    OTHERS(3, "その他"),
    NOANSWER(4, "回答しない");

    private final Integer code;
    private final String name;

    GenderEnum(Integer code, String name) {
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

    public static GenderEnum getEnumByCode(Integer code) {
        return Arrays.stream(values())
                .filter(enumeration -> Objects.equals(enumeration.code, code))
                .findFirst()
                .orElse(null);
    }
}
