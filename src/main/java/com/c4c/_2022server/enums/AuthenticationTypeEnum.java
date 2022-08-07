package com.c4c._2022server.enums;

import java.util.Arrays;
import java.util.Objects;

public enum AuthenticationTypeEnum implements EnumBase {
    STUFF(1, "スタッフ"),
    CUSTOMER(2, "顧客");

    private final Integer code;
    private final String name;

    AuthenticationTypeEnum(Integer code, String name) {
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

    public static AuthenticationTypeEnum getEnumByCode(Integer code) {
        return Arrays.stream(values())
                .filter(enumeration -> Objects.equals(enumeration.code, code))
                .findFirst()
                .orElse(null);
    }
}
