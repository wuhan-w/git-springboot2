package com.itheima.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Book implements Serializable {
    private int id;
    private String type;
    private String name;
    private String description;
}
