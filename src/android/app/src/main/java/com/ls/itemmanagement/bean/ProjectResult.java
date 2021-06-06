package com.ls.itemmanagement.bean;

import java.util.List;

public class ProjectResult {

    private int projectId;
    private String projectName;
    private String projectInsertDate;
    private String projectStartDate;
    private String projectEndDate;
    private int projectCategoryId;
    private int customerId;
    private CustomerDTO customer;
    private String html;
    private String categoryName;
    private List<ServesDTO> serves;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectInsertDate() {
        return projectInsertDate;
    }

    public void setProjectInsertDate(String projectInsertDate) {
        this.projectInsertDate = projectInsertDate;
    }

    public String getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(String projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public String getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(String projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public int getProjectCategoryId() {
        return projectCategoryId;
    }

    public void setProjectCategoryId(int projectCategoryId) {
        this.projectCategoryId = projectCategoryId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<ServesDTO> getServes() {
        return serves;
    }

    public void setServes(List<ServesDTO> serves) {
        this.serves = serves;
    }

    public static class CustomerDTO {
        private int userId;
        private String userName;
        private int roleId;
        private String userPassword;
        private Object userSex;
        private Object userPhoneNum;
        private Object userWechat;
        private Object userQqNum;
        private Object userEmailAddress;
        private Object userAddress;
        private Object userCategoryId;

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

        public int getRoleId() {
            return roleId;
        }

        public void setRoleId(int roleId) {
            this.roleId = roleId;
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
    }

    public static class ServesDTO {
        private int userId;
        private String userName;
        private int roleId;
        private String userPassword;
        private Object userSex;
        private Object userPhoneNum;
        private Object userWechat;
        private Object userQqNum;
        private Object userEmailAddress;
        private Object userAddress;
        private Object userCategoryId;

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

        public int getRoleId() {
            return roleId;
        }

        public void setRoleId(int roleId) {
            this.roleId = roleId;
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
    }
}
