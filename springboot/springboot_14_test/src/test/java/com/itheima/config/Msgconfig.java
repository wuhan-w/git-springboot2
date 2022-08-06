package com.itheima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Msgconfig {

    @Bean
    public String msg(){
        return "bean msg";
    }
}
