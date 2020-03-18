package com.test.mybatis.mapper;

import com.test.mybatis.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TeacherMapper {

    //获取指定老师信息及其所有学生信息
    Teacher getTeacher(@Param("id") int id);

    Teacher getTeacher2(@Param("id") int id);


}
