package com.ls.itemmanagement.module.project.presenter;

import com.google.gson.Gson;
import com.ls.itemmanagement.base.BaseBean;
import com.ls.itemmanagement.base.BaseObserver;
import com.ls.itemmanagement.base.BasePresenter;
import com.ls.itemmanagement.bean.ProjectResult;
import com.ls.itemmanagement.module.project.view.IProjectView;

import okhttp3.RequestBody;

public class ProjectPresenter extends BasePresenter<IProjectView> {
    public ProjectPresenter(IProjectView baseView) {
        super(baseView);
    }
    public void getProjectInfoById(int projectId){
        ProjectResult project = new ProjectResult();
        project.setProjectId(projectId);
        Gson gson=new Gson();
        String info =gson.toJson(project);
        RequestBody requestBody = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"),info);
        addDisposable(apiServer.getProjectInfoById(requestBody), new BaseObserver<BaseBean<ProjectResult>>(baseView, false) {
            @Override
            public void onSuccess(BaseBean<ProjectResult> o) {
                baseView.getProjectInfoSuccess("获得项目信息成功",o.data);
            }

            @Override
            public void onError(String msg) {
                baseView.getProjectInfoFailed("获得项目信息失败");
            }
        });
    }
}
