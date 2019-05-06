package com.minhthyu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "User")

public class User {
    @Id
    @Column(name = "uId", length = 11, nullable = false)
    private String uId;
    @Column(name = "uPassword", length = 20, nullable = false)
    private String uPassword;
    @Column(name = "uStatus")
    private int uStatus;
    @Column(name = "uLoginTime")
    private Date uLoginTime;
    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public int getuStatus() {
        return uStatus;
    }

    public void setuStatus(int uStatus) {
        this.uStatus = uStatus;
    }

    public Date getuLoginTime() {
        return uLoginTime;
    }

    public void setuLoginTime(Date uLoginTime) {
        this.uLoginTime = uLoginTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId='" + uId + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uStatus=" + uStatus +
                ", uLoginTime=" + uLoginTime +
                '}';
    }
}
