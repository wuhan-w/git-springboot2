package com.itheima.controller;

import com.itheima.MyDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// rest模式
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private MyDatasource myDatasource;
    @GetMapping
    public String getById(){
        System.out.println("spring boot is running.....");
        System.out.println("----------------");
        System.out.println(myDatasource);
        return "spring boot is running.....";
    }
    @GetMapping("/{id}")
    public String selectById(@PathVariable Integer id){
        System.out.println("id---->"+id);
        return "id----------";
    }

}
