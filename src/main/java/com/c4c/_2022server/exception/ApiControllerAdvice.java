package com.c4c._2022server.exception;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
}
