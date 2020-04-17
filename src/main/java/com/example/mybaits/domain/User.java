package com.example.mybaits.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

    private Integer userId;
    private String userName;
    private String  userAddress;
    private String userSex;
    private String userBirthday;

    public User(Integer userId, String userName, String userAddress, String userSex, String userBirthday) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        this.userSex = userSex;
        this.userBirthday = userBirthday;
    }

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }
}
