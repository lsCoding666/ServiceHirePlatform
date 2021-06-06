package com.ls.itemmanagement.module.userreglog.view;


import com.ls.itemmanagement.base.BaseView;
import com.ls.itemmanagement.bean.LoginResult;

public interface IRegisterView extends BaseView {
    /**
     * 显示注册成功
     *
     * @param successMessage 成功信息
     */
    void showRegisterSuccess(String successMessage);

    /**
     * 显示注册失败
     *
     * @param errorMessage 失败信息
     */
    void showRegisterFailed(String errorMessage);

    /**
     * 显示注册后登录成功
     *
     * @param successMessage 成功信息
     */
    void showLoginAfterRegisterSuccess(String successMessage, LoginResult result);

    /**
     * 显示注册后登录失败
     *
     * @param errorMessage 失败信息
     */
    void showLoginAfterRegisterFailed(String errorMessage);
}
