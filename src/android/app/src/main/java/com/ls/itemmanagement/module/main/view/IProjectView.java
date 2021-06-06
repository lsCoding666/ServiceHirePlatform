package com.ls.itemmanagement.module.main.view;


import com.ls.itemmanagement.base.BaseView;
import com.ls.itemmanagement.bean.ProjectResult;

import java.util.List;

/**
 * @author 梁爽
 * @create 2020/8/5 16:12
 */
public interface IProjectView extends BaseView {
    /**
     * 获得项目信息成功
     * @param successMessage
     * @param project
     */
    void getAllProjectSuccess(String successMessage, List<ProjectResult> project);

    void getAllProjectFailed(String failedMsg);
}
