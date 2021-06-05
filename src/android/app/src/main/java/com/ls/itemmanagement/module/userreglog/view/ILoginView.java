package com.ls.itemmanagement.module.userreglog.view;


import com.ls.itemmanagement.base.BaseView;
import com.ls.itemmanagement.bean.LoginResult;

public interface ILoginView extends BaseView {
    /**
     * 显示登录成功
     *
     * @param successMessage 成功信息
     */
    void showLoginSuccess(String successMessage, LoginResult result);

    /**
     * 显示登录失败
     *
     * @param errorMessage 失败信息
     */
    void showLoginFailed(String errorMessage);

}
