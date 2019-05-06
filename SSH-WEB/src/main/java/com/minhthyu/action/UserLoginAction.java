package com.minhthyu.action;

import com.minhthyu.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserLoginAction extends ActionSupport {
    private UserService userService;
    private String username;
    private String password;

    public UserService getUserService() {
        return userService;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String canLogin(){
        System.out.println("==========");
        if (userService.canLogin(username,password)) return SUCCESS;
        else return ERROR;
    }
}
