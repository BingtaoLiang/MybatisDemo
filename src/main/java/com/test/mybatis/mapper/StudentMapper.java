package com.test.mybatis.mapper;

import com.test.mybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    //查询所有学生信息和老师信息
    List<Student> getStudent();

    List<Student> getStudent2();
}
