package com.ls.itemmanagement.module.main.presenter;

import com.ls.itemmanagement.base.BaseBean;
import com.ls.itemmanagement.base.BaseObserver;
import com.ls.itemmanagement.base.BasePresenter;
import com.ls.itemmanagement.bean.ProjectResult;
import com.ls.itemmanagement.module.main.view.IProjectView;

import java.util.List;

public class ProjectPresenter  extends BasePresenter<IProjectView> {
    public ProjectPresenter(IProjectView baseView) {
        super(baseView);
    }

    public void getAllProjects(){
        addDisposable(apiServer.getAllProjects(), new BaseObserver<BaseBean<List<ProjectResult>>>(baseView, false) {

            @Override
            public void onSuccess(BaseBean<List<ProjectResult>> o) {
                baseView.getAllProjectSuccess("获取所有项目成功",o.data);
            }

            @Override
            public void onError(String msg) {
                baseView.getAllProjectFailed(msg);
            }
        });
    }
}
