package com.itheima.service.impl;

import com.itheima.service.MessageService;
import com.itheima.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private MessageService messageService;
    @Override
    public void order(String id) {
        // 一系列的操作，包含各种服务的调用，处理各种业务
        System.out.println("短信消息处理开始");
        // 短信信息处理
        messageService.sendMessage(id);
        System.out.println("短信消息处理结束");
        System.out.println();
    }
}
