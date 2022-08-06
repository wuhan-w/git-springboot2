package com.itheima.service;

public interface MessageService {
    void sendMessage(String id); // 把id放入消息队列中
    String doMessage();  // 从消息的队列中取出做短信的处理，发短信
}
