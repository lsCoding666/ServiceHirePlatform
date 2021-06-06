package com.ls.itemmanagement.module.user.view;

import com.ls.itemmanagement.base.BaseView;
import com.ls.itemmanagement.bean.UserInfo;

import java.util.List;

public interface IUserView extends BaseView {
    void getAllUsersSuccess(String msg, List<UserInfo> userInfos);

    void getAllUsersFailed(String msg);

    void getUserInfoSuccess(String msg,UserInfo userInfo);

    void getUserInfoFailed(String msg);
}
