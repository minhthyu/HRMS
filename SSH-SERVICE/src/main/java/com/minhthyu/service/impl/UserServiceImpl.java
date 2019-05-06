package com.minhthyu.service.impl;

import com.minhthyu.dao.UserDao;
import com.minhthyu.entity.User;
import com.minhthyu.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = null;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User checkExist(String uId) {
        User user = userDao.selectUser(uId);
        if (user!=null){
            return user;
        }
        return null;
    }

    public boolean canLogin(String uId, String password) {
        User user = checkExist(uId);
        if (user !=null){
            if (user.getuPassword().equals(password)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
