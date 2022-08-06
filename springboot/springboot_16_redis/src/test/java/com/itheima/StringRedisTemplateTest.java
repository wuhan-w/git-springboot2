package com.itheima;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class StringRedisTemplateTest {

    @Autowired
    private StringRedisTemplate redisTemplate;




    @Test
    void set(){
        ValueOperations<String, String> ops = redisTemplate.opsForValue();

    }

    @Test
    void get(){

        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        String name = ops.get("name");
        System.out.println(name);

    }

    @Test
    void hset(){
        HashOperations opsH = redisTemplate.opsForHash();
        opsH.put("testKeyH","testFieldH","testValueH");

    }

    @Test
    void hget(){

        HashOperations opsH = redisTemplate.opsForHash();
        Object valH = opsH.get("testKeyH", "testFieldH");
        System.out.println(valH);

    }


}
