package com.minhthyu.service;

import com.minhthyu.entity.User;

public interface UserService {


    /**
     * 检查是否存在用户
     * @param uId 用户的id
     * @return 用户实体
     */
    public User checkExist(String uId);

    /**
     * 判断是否可以登录
     * @param uId 用户的id
     * @return true - 可以登录 false - 不可以登录
     */
    public boolean canLogin(String uId, String password);
}
