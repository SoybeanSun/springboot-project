package com.evan.sxb.dao;

import com.evan.sxb.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

//由于使用了JPA，无需使用SQL语句，只需要按照规范提供的方法的名字既可以对数据库增删改查
public interface UserDAO extends JpaRepository<User,Integer> {
    //通过用户名查询
    User findByUsername(String username);
    //通过用户名及密码查询
    User getByUsernameAndPassword(String username,String password);
}
