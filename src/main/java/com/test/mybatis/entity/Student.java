package com.test.mybatis.entity;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    private int tid;

//    //学生需要关联一个老师
//    private Teacher teacher;
}
