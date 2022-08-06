package com.itheima;

import com.itheima.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot05MyBatisApplicationTests {

    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads() {
        System.out.println(userDao.getById(4));
    }

}
