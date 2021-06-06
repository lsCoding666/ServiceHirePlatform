package com.ls.itemmanagement.module.userreglog.presenter;

import com.google.gson.Gson;
import com.ls.itemmanagement.base.BaseBean;
import com.ls.itemmanagement.base.BaseObserver;
import com.ls.itemmanagement.base.BasePresenter;
import com.ls.itemmanagement.bean.UserInfo;
import com.ls.itemmanagement.bean.LoginResult;
import com.ls.itemmanagement.module.userreglog.view.ILoginView;


import okhttp3.RequestBody;

/**
 * @author 梁爽
 * @create 2020/9/22 23:54
 */
public class LoginPresenter extends BasePresenter<ILoginView> {

    public LoginPresenter(ILoginView baseView) {
        super(baseView);
    }

    public void login(String userName, String password){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(userName);
        userInfo.setUserPassword(password);
        Gson gson=new Gson();
        String info =gson.toJson(userInfo);
        RequestBody requestBody = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"),info);
        addDisposable(apiServer.login(requestBody), new BaseObserver<BaseBean<UserInfo>>(baseView, true) {
            @Override
            public void onSuccess(BaseBean<UserInfo> o) {
                baseView.showLoginSuccess("登陆成功",o.data);
            }

            @Override
            public void onError(String msg) {
                baseView.showLoginFailed(msg);
            }
        });
    }
}
