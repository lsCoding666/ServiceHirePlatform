package xyz.lsgdut.dhxt.pojo.VO;

public class UserVO {

    private String userPassword;

    private String userSex;

    private String userPhoneNum;

    private String userWechat;

    private String userQqNum;

    private String userEmailAddress;

    private String userAddress;

    private Integer userCategoryId;

    private Integer userId;

    private String userName;

    private Integer roleId;

    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserPhoneNum() {
        return userPhoneNum;
    }

    public void setUserPhoneNum(String userPhoneNum) {
        this.userPhoneNum = userPhoneNum == null ? null : userPhoneNum.trim();
    }

    public String getUserWechat() {
        return userWechat;
    }

    public void setUserWechat(String userWechat) {
        this.userWechat = userWechat == null ? null : userWechat.trim();
    }

    public String getUserQqNum() {
        return userQqNum;
    }

    public void setUserQqNum(String userQqNum) {
        this.userQqNum = userQqNum == null ? null : userQqNum.trim();
    }

    public String getUserEmailAddress() {
        return userEmailAddress;
    }

    public void setUserEmailAddress(String userEmailAddress) {
        this.userEmailAddress = userEmailAddress == null ? null : userEmailAddress.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Integer getUserCategoryId() {
        return userCategoryId;
    }

    public void setUserCategoryId(Integer userCategoryId) {
        this.userCategoryId = userCategoryId;
    }
}
