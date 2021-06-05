package com.ls.itemmanagement.bean;

/**
 * @author 梁爽
 * @create 2020/9/22 23:51
 */
public class LoginResult {


    private int userId;
    private String userName;
    private String userPassword;
    private Object userSex;
    private Object userPhoneNum;
    private Object userWechat;
    private Object userQqNum;
    private Object userEmailAddress;
    private Object userAddress;
    private Object userCategoryId;
    private int roleId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

    public Object getUserSex() {
        return userSex;
    }

    public void setUserSex(Object userSex) {
        this.userSex = userSex;
    }

    public Object getUserPhoneNum() {
        return userPhoneNum;
    }

    public void setUserPhoneNum(Object userPhoneNum) {
        this.userPhoneNum = userPhoneNum;
    }

    public Object getUserWechat() {
        return userWechat;
    }

    public void setUserWechat(Object userWechat) {
        this.userWechat = userWechat;
    }

    public Object getUserQqNum() {
        return userQqNum;
    }

    public void setUserQqNum(Object userQqNum) {
        this.userQqNum = userQqNum;
    }

    public Object getUserEmailAddress() {
        return userEmailAddress;
    }

    public void setUserEmailAddress(Object userEmailAddress) {
        this.userEmailAddress = userEmailAddress;
    }

    public Object getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(Object userAddress) {
        this.userAddress = userAddress;
    }

    public Object getUserCategoryId() {
        return userCategoryId;
    }

    public void setUserCategoryId(Object userCategoryId) {
        this.userCategoryId = userCategoryId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
