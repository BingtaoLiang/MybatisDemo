package com.test.mybatis.entity;

import lombok.Data;

import java.util.List;

@Data
public class Classes {
    private int cid;
    private String cname;

    private List<Teacher> teachers;
}
