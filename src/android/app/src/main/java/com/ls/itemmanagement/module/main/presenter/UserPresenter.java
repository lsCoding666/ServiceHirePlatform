package com.ls.itemmanagement.module.main.presenter;

import com.ls.itemmanagement.base.BaseBean;
import com.ls.itemmanagement.base.BaseObserver;
import com.ls.itemmanagement.base.BasePresenter;
import com.ls.itemmanagement.bean.UserInfo;
import com.ls.itemmanagement.module.main.view.IUserView;

import java.util.List;

public class UserPresenter  extends BasePresenter<IUserView> {
    public UserPresenter(IUserView baseView) {
        super(baseView);
    }

    public void getAllUserInfo(){
        addDisposable(apiServer.getAllUsers(), new BaseObserver<BaseBean<List<UserInfo>>>(baseView, false) {

            @Override
            public void onSuccess(BaseBean<List<UserInfo>> o) {
                baseView.getAllUsersSuccess("成功",o.data);
            }

            @Override
            public void onError(String msg) {
                baseView.getAllUsersFailed(msg);
            }
        });
    }
}
