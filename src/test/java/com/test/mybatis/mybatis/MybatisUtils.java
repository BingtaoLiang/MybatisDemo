package com.test.mybatis.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//sqlSessionFactory --> sqlSession
public class MybatisUtils {
    public static SqlSessionFactory sqlSessionFactory;

    //使用mybatis第一步：获取sqlSessionFactory对象
    static {
        try {
            // 指定全局配置文件
            String resource = "mybatis-config.xml";
            // 读取配置文件
            InputStream inputStream = Resources.getResourceAsStream(resource);
            // 构建sqlSessionFactory
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //有了sqlSessionFactory 我们就可以从中获得sqlSession的实例了
    //sqlSession完全包含了面向数据库执行SQL命令所需的全部方法
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession(true);
    }
}
