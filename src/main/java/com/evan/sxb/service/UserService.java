package com.evan.sxb.service;

import com.evan.sxb.dao.UserDAO;
import com.evan.sxb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDAO userDao;

    public boolean isExist(String userName){
        User user = getByName(userName);
        return null!=user;
    }
    public User getByName(String username) {
        return userDao.findByUsername(username);
    }
    public User get(String username, String password){
        return userDao.getByUsernameAndPassword(username, password);
    }
    public void add(User user) {
        userDao.save(user);
    }
}
