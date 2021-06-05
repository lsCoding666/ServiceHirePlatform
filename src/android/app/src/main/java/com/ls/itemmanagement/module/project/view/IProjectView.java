package com.ls.itemmanagement.module.project.view;

import com.ls.itemmanagement.base.BaseView;
import com.ls.itemmanagement.bean.ProjectResult;

public interface IProjectView extends BaseView {
    void getProjectInfoSuccess(String msg, ProjectResult project);
    void getProjectInfoFailed(String msg);
}
