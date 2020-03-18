package com.test.mybatis.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
//@Alias("User")  通过注解起别名
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String pwd;

    public User(Integer id, String name, Integer age, String pwd) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.pwd = pwd;
    }
}
