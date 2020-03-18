package com.test.mybatis.mapper;

import com.test.mybatis.entity.Classes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassesMapper {

    Classes findClassesWihTeacher(@Param("cid") int cid);

    List<Classes> findAll();
}
