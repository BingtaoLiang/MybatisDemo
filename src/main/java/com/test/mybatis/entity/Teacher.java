package com.test.mybatis.entity;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int id;
    private String name;

    //一个老师拥有多个学生  一对多
//    private List<Student> students;


    private List<Classes> classes;
}
