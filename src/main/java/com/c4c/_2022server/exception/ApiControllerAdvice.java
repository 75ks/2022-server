package com.c4c._2022server.exception;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.security.sasl.AuthenticationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.c4c._2022server.form.MessageRes;

/**
 * 共通の例外処理を行うクラス
 */
@RestControllerAdvice
public class ApiControllerAdvice extends ResponseEntityExceptionHandler {
    /**
     * 認証エラーの共通処理
     * @return ResponseEntity
     */
    @ExceptionHandler(AuthenticationException.class)
    protected ResponseEntity<Object> handleAuthenticationException(AuthenticationException ex) {
        List<String> messageList = Collections.singletonList(ex.getMessage());

        MessageRes resForm = new MessageRes();
        resForm.setMessageList(messageList);

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(resForm);
    }

    /**
     * バリデーションエラーの共通処理
     * @return ResponseEntity
     */
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<String> messageList = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(e -> e.getDefaultMessage())
                // 上記を右記に書き換えも可能 .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.toList());

        MessageRes resForm = new MessageRes();
        resForm.setMessageList(messageList);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(resForm);
    }

    /**
     * データ重複エラー(登録前の重複チェック時)の共通処理
     * @return ResponseEntity
     */
    @ExceptionHandler(DuplicationException.class)
    protected ResponseEntity<Object> handleDuplicationException(Exception ex) {
        List<String> messageList = Collections.singletonList(ex.getMessage());

        MessageRes resForm = new MessageRes();
        resForm.setMessageList(messageList);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(resForm);
    }
}
