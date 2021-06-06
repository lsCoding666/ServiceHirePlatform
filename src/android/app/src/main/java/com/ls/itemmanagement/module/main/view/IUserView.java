package com.ls.itemmanagement.module.main.view;

import com.ls.itemmanagement.base.BaseView;
import com.ls.itemmanagement.bean.UserInfo;

import java.util.List;

public interface IUserView extends BaseView {

    void getAllUsersSuccess(String msg, List<UserInfo> userInfo);

    void getAllUsersFailed(String msg);
}
