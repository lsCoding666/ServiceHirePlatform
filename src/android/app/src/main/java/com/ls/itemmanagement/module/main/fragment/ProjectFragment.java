package com.ls.itemmanagement.module.main.fragment;


import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gyf.immersionbar.ImmersionBar;
import com.ls.itemmanagement.R;
import com.ls.itemmanagement.base.BaseFragment;
import com.ls.itemmanagement.bean.ProjectResult;
import com.ls.itemmanagement.common.FinalDatas;
import com.ls.itemmanagement.module.main.adapter.ProjectRvAdapter;
import com.ls.itemmanagement.module.main.presenter.ProjectPresenter;
import com.ls.itemmanagement.module.main.view.IProjectView;
import com.ls.itemmanagement.module.project.activity.ProjectInfoActivity;
import com.ls.itemmanagement.util.ToastUtil;
import com.ls.itemmanagement.util.XUtil;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.stx.xhb.xbanner.XBanner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class ProjectFragment extends BaseFragment<ProjectPresenter> implements IProjectView {
    @BindView(R.id.iv_title_left)
    ImageView mIvTitleLeft;
    @BindView(R.id.tv_title_center)
    TextView mTvTitleCenter;
    @BindView(R.id.rl_title)
    RelativeLayout mRlTitle;
    @BindView(R.id.project_category_rv2)
    RecyclerView rvProjectCategory2;
    @BindView(R.id.project_rv)
    RecyclerView rvProject;
    @BindView(R.id.project_refreshLayout)
    RefreshLayout rfProject;
    @BindView(R.id.main_xbanner)
    XBanner xBanner;
    private ProjectRvAdapter projectAdapter;
    private GridLayoutManager gridLayoutManager2;
    private List<ProjectResult> projects = new ArrayList<>();

    @Override
    protected ProjectPresenter createPresenter() {
        return new ProjectPresenter(this);
    }

    private void initBanner() {
        //XBanner
        //加载广告图片
        List<String> imgesUrl = new ArrayList<>();
        imgesUrl.add("http://imageprocess.yitos.net/images/public/20160910/99381473502384338.jpg");
        imgesUrl.add("http://imageprocess.yitos.net/images/public/20160910/77991473496077677.jpg");
        imgesUrl.add("http://imageprocess.yitos.net/images/public/20160906/1291473163104906.jpg");
        xBanner.loadImage(new XBanner.XBannerAdapter() {
            @Override
            public void loadBanner(XBanner banner, Object model, View view, int position) {
                //在此处使用图片加载框架加载图片，demo中使用glide加载，可替换成自己项目中的图片加载框架
                Glide.with(getActivity()).load(imgesUrl.get(position)).into((ImageView) view);
            }
        });
        xBanner.setBannerData(imgesUrl);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.frament_manage_project;
    }

    private void initProjectRv() {
        //项目RV
        projectAdapter = new ProjectRvAdapter(projects);
        gridLayoutManager2 = new GridLayoutManager(getActivity(), 2, RecyclerView.VERTICAL, false);
        rvProject.setAdapter(projectAdapter);
        rvProject.setLayoutManager(gridLayoutManager2);
        projectAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                List<ProjectResult> projectList = adapter.getData();
                Intent intent = new Intent(getActivity(), ProjectInfoActivity.class);
                intent.putExtra(FinalDatas.PROJECT_ID, projectList.get(position).getProjectId());
                startActivity(intent);
            }
        });
    }

    @Override
    protected void initView(View v) {
        mTvTitleCenter.setText(XUtil.getString(R.string.manage_project));
        ImmersionBar.with(this).titleBar(mRlTitle).init();
        //initProjectCategoryRv();
        initProjectRv();
        //initRefreshLayout();
        initBanner();
    }

    @Override
    protected void initData() {
        presenter.getAllProjects();
    }

    @Override
    public void getAllProjectSuccess(String successMessage, List<ProjectResult> project) {
        this.projects = project;
        initProjectRv();
    }

    @Override
    public void getAllProjectFailed(String failedMsg) {
        ToastUtil.showToast(failedMsg);
    }
}