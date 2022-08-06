package com.itheima.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    @Scheduled(cron = "0/1 * * * * ?")
    public void springTask(){
        System.out.println(Thread.currentThread().getName()+"spring task is run");
    }

}
