package com.ls.itemmanagement.module.main.adapter;

import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.ls.itemmanagement.R;
import com.ls.itemmanagement.bean.ProjectResult;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 梁爽
 * @create 2020/8/6 10:21
 */
public class ProjectRvAdapter extends BaseQuickAdapter<ProjectResult, BaseViewHolder> {

    private List<ProjectResult> projects = new ArrayList<>();



    public ProjectRvAdapter(@Nullable List<ProjectResult> data) {
        super(R.layout.view_task, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, ProjectResult project) {
        helper.setText(R.id.task_title, project.getProjectName());
    }
}
