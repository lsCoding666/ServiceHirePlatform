package com.ls.itemmanagement.module.userreglog.presenter;

import com.google.gson.Gson;
import com.ls.itemmanagement.base.BaseBean;
import com.ls.itemmanagement.base.BaseObserver;
import com.ls.itemmanagement.base.BasePresenter;
import com.ls.itemmanagement.bean.UserInfo;
import com.ls.itemmanagement.bean.LoginResult;
import com.ls.itemmanagement.bean.RegisterInfo;
import com.ls.itemmanagement.module.userreglog.view.IRegisterView;

import java.util.List;

import okhttp3.RequestBody;

public class RegisterPresenter extends BasePresenter<IRegisterView> {
    public RegisterPresenter(IRegisterView baseView) {
        super(baseView);
    }

    public void register(String userName, String userPassword, String userPhone) {

        RegisterInfo registerInfo = new RegisterInfo();
        registerInfo.setUserName(userName);
        registerInfo.setUserPassword(userPassword);
        registerInfo.setUserPhone(userPhone);
        Gson gson = new Gson();
        String info = gson.toJson(registerInfo);
        RequestBody requestBody = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), info);
        addDisposable(apiServer.register(requestBody), new BaseObserver<BaseBean>(baseView, false) {
            @Override
            public void onSuccess(BaseBean o) {
                baseView.showRegisterSuccess("注册成功");
                loginAfterRegister(userName, userPassword);
            }

            @Override
            public void onError(String msg) {
                baseView.showRegisterFailed(msg);
            }
        });

    }

    private void loginAfterRegister(String userName, String password) {

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(userName);
        userInfo.setUserPassword(password);
        Gson gson = new Gson();
        String info = gson.toJson(userInfo);
        RequestBody requestBody = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), info);
        addDisposable(apiServer.login(requestBody), new BaseObserver<BaseBean<List<LoginResult>>>(baseView, false) {
            @Override
            public void onSuccess(BaseBean<List<LoginResult>> o) {
                baseView.showLoginAfterRegisterSuccess("登陆成功", o.data.get(0));
            }

            @Override
            public void onError(String msg) {
                baseView.showLoginAfterRegisterFailed(msg);
            }
        });
    }
}
