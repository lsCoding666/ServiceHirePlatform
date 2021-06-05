package com.ls.itemmanagement.module.userreglog.presenter;

import com.google.gson.Gson;
import com.ls.itemmanagement.base.BaseBean;
import com.ls.itemmanagement.base.BaseObserver;
import com.ls.itemmanagement.base.BasePresenter;
import com.ls.itemmanagement.bean.LoginInfo;
import com.ls.itemmanagement.bean.LoginResult;
import com.ls.itemmanagement.module.userreglog.view.ILoginView;


import java.util.List;

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
        LoginInfo loginInfo = new LoginInfo(userName,password);
        Gson gson=new Gson();
        String info =gson.toJson(loginInfo);
        RequestBody requestBody = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"),info);
        addDisposable(apiServer.login(requestBody), new BaseObserver<BaseBean<LoginResult>>(baseView, true) {
            @Override
            public void onSuccess(BaseBean<LoginResult> o) {
                baseView.showLoginSuccess("登陆成功",o.data);
            }

            @Override
            public void onError(String msg) {
                baseView.showLoginFailed(msg);
            }
        });
    }
}
