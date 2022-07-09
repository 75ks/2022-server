package com.c4c._2022server.constants;

public enum ReserveState {
    RESERVED(1, "予約済"),
    VISITED(2, "来店済"),
    CHANGE(3, "予約日時変更"),
    CANCEL(4, "キャンセル");

    private final Integer code;
    private final String name;

    ReserveState(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public static ReserveState getByCode(Integer code) {
        for (ReserveState reserveState : ReserveState.values()) {
            if (reserveState.getCode().equals(code)) {
                return reserveState;
            }
        }
        return null;
    }
}
