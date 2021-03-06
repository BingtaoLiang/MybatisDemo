package com.test.mybatis.mapper;

import com.test.mybatis.entity.Blog;

import java.util.List;
import java.util.Map;


public interface BlogMapper {

    //插入数据
    int addBlog(Blog blog);

    //IF查询博客
    List<Blog> queryBlogIF(Map map);

    //choose查询博客
    List<Blog> queryBlogChoose(Map map);

    //更新博客
    int updateBlog(Map map);

    //查询第1,2,3号博客
    List<Blog> queryBlogForeach(Map map);
}
