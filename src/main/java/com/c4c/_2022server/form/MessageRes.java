package com.c4c._2022server.form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageRes {
    /**
     * メッセージリスト
     */
    List<String> messageList;

    /**
     * メッセージを設定する
     * @param messages
     */
    public void setMessages(String ...messages) {
        this.messageList = new ArrayList<>();
        messageList.addAll(Arrays.asList(messages));
    }
}
