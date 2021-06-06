package com.ls.itemmanagement.module.user.presenter;

import com.google.gson.Gson;
import com.ls.itemmanagement.base.BaseBean;
import com.ls.itemmanagement.base.BaseObserver;
import com.ls.itemmanagement.base.BasePresenter;
import com.ls.itemmanagement.base.BaseView;
import com.ls.itemmanagement.bean.UserInfo;
import com.ls.itemmanagement.module.user.view.IUserView;

import java.util.List;

import okhttp3.RequestBody;

public class UserInfoPresenter extends BasePresenter<IUserView> {


    public UserInfoPresenter(IUserView baseView) {
        super(baseView);
    }

    public void getAllUsers(){
        addDisposable(apiServer.getAllUsers(), new BaseObserver<BaseBean<List<UserInfo>>>(baseView, false) {
            @Override
            public void onSuccess(BaseBean<List<UserInfo>> o) {
                baseView.getAllUsersSuccess("获取成功",o.data);
            }

            @Override
            public void onError(String msg) {
                baseView.getAllUsersFailed("获取失败");
            }
        });
    }

    public void getuserInfoById(int userId){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        Gson gson=new Gson();
        String info =gson.toJson(userInfo);
        RequestBody requestBody = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"),info);
        addDisposable(apiServer.getUserInfoById(requestBody), new BaseObserver<BaseBean<UserInfo>>(baseView, false) {
            @Override
            public void onSuccess(BaseBean<UserInfo> o) {
                baseView.getUserInfoSuccess("获取成功",o.data);
            }

            @Override
            public void onError(String msg) {
                baseView.getUserInfoFailed("获取失败");
            }
        });
    }
}
