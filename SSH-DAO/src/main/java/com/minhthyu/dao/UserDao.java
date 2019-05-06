package com.minhthyu.dao;

import com.minhthyu.entity.User;

import java.util.List;

public interface UserDao {
//    /**
//     * 验证用户名是否存在
//     * @param username 用户名
//     * @return 1-存在 0-不存在
//     */
//    boolean verifyUsername(String username);
//
//    /**
//     * 验证用户名密码是否正确
//     * @param username
//     * @param password
//     * @return 1-正确 0-不正确
//     */
//    boolean verifyPassword(String username, String password);

    /**
     * 插入用户
     * @param newUser 新用户
     * @return true-成功 false-失败
     */
    boolean insertUser(User newUser);


    /**
     * 删除用户
     * @param user 删除的用户
     * @return true-成功 false-失败
     */
    boolean deleteUser(User user);

    /**
     * 更新用户
     * @param user 更新的用户
     * @return true-成功 false-失败
     */
    boolean update(User user);

    /**
     * 查找用户
     * @param uId  查找的用户编号
     * @return 用户对象列表
     */
    User selectUser(String uId);

}
