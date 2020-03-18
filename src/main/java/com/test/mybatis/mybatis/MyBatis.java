package com.test.mybatis.mybatis;

import com.test.mybatis.entity.User;
import com.test.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatis {
//    public static void main(String[] args) {
//        public void getUserList() {
//            SqlSession sqlSession = MybatisUtils.getSqlSession();
//            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//            List<User> userList = mapper.getUserList();
//            for (User user : userList) {
//                System.out.println(user);
//            }
//            sqlSession.close();
//        }
//        public void getUserById(){
//            SqlSession sqlSession = MybatisUtils.getSqlSession();
//            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//            User userById = mapper.getUserById(1);
//            System.out.println(userById);
//            sqlSession.close();
//        }
//
//
//        //增删改需要提交事务
//        public void addUser(){
//            SqlSession sqlSession = MybatisUtils.getSqlSession();
//            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//            mapper.addUser(new User(4,"赵六",22,"123"));
//
//            //提交事务
//            sqlSession.commit();
//            sqlSession.close();
//        }
//    }
//
//
//
}
