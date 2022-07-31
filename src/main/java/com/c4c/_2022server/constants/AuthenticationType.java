package com.c4c._2022server.constants;

public enum AuthenticationType {
    STUFF(1, "スタッフ"),
    CUSTOMER(2, "顧客");

    private final Integer code;
    private final String name;

    private AuthenticationType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public static AuthenticationType getByCode(Integer code) {
        for (AuthenticationType authenticationType : AuthenticationType.values()) {
            if (authenticationType.getCode().equals(code)) {
                return authenticationType;
            }
        }
        return null;
    }

    public static AuthenticationType getByName(String name) {
        for (AuthenticationType authenticationType : AuthenticationType.values()) {
            if (authenticationType.getName().equals(name)) {
                return authenticationType;
            }
        }
        return null;
    }
}
