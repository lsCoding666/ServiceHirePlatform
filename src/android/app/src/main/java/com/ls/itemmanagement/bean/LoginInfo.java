package com.ls.itemmanagement.bean;

/**
 * @author 梁爽
 * @create 2020/9/22 23:59
 */
public class LoginInfo {

    /**
     * userName : lstest3
     * userPassword : 1
     */
    public LoginInfo(String userName, String userPassword){
        this.userName = userName;
        this.userPassword  = userPassword;
    }
    private String userName;
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
