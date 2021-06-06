package com.ls.itemmanagement.module.project.activity;

import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ls.itemmanagement.R;
import com.ls.itemmanagement.base.BaseActivity;
import com.ls.itemmanagement.bean.ProjectResult;
import com.ls.itemmanagement.common.FinalDatas;
import com.ls.itemmanagement.module.project.adapter.ServersRvAdapter;
import com.ls.itemmanagement.module.project.presenter.ProjectPresenter;
import com.ls.itemmanagement.module.project.view.IProjectView;
import com.zzhoujay.richtext.RichText;

import butterknife.BindView;

public class ProjectInfoActivity extends BaseActivity<ProjectPresenter> implements IProjectView {
    private ProjectResult project;

    @BindView(R.id.title_bar_text)
    TextView mTvTittle;
    @BindView(R.id.manage_project_user_btn)
    Button mBtnManageProjectUser;
    @BindView(R.id.project_user_rv)
    RecyclerView mRVProjectUser;
    @BindView(R.id.project_detail_tv)
    TextView mTvProjectDetail;
    @BindView(R.id.create_time_tv)
    TextView mTvCreateTime;
    @BindView(R.id.start_time_tv)
    TextView mTvStartTime;
    @BindView(R.id.end_time_tv)
    TextView mTvEndTime;
    @BindView(R.id.project_category_tv)
    TextView mTvProjectCategory;
    @BindView(R.id.customer_name_tv)
    TextView mTvCustomerName;


    private int mProjectId;

    @Override
    protected ProjectPresenter createPresenter() {
        return new ProjectPresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_project_detail;
    }

    @Override
    protected void initView() {

    }

    private void updateView(){
        mTvTittle.setText(project.getProjectName());
        mTvCreateTime.setText(project.getProjectInsertDate().toString());
        mTvEndTime.setText(project.getProjectEndDate().toString());
        mTvStartTime.setText(project.getProjectStartDate().toString());
        mTvCustomerName.setText(project.getCustomer().getUserName());
        mTvProjectCategory.setText(project.getCategoryName());
        RichText.fromHtml(project.getHtml()).into(mTvProjectDetail);
        updateRV();
    }

    private void updateRV(){
        LinearLayoutManager lm = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        mRVProjectUser.setLayoutManager(lm);
        ServersRvAdapter adapter = new ServersRvAdapter(project.getServes());
        mRVProjectUser.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        mProjectId = getIntent().getIntExtra(FinalDatas.PROJECT_ID,-1);
        presenter.getProjectInfoById(mProjectId);
    }

    @Override
    public void initStatusBar() {

    }

    @Override
    public void getProjectInfoSuccess(String msg, ProjectResult project) {
        this.project = project;
        updateView();
    }

    @Override
    public void getProjectInfoFailed(String msg) {

    }
}
