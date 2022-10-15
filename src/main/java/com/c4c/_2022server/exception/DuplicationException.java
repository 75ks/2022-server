package com.c4c._2022server.exception;

/**
 * データ重複エラー(登録前の重複チェック時)
 */
public class DuplicationException extends Exception {
    public DuplicationException() {
    }

    public DuplicationException(String msg) {
        super(msg);
    }

    public DuplicationException(String msg, Throwable ex) {
        super(msg, ex);
    }
}
