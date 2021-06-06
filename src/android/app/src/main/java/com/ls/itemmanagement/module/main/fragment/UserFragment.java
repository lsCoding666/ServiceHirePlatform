package com.ls.itemmanagement.module.main.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gyf.immersionbar.ImmersionBar;
import com.ls.itemmanagement.R;
import com.ls.itemmanagement.base.BaseFragment;
import com.ls.itemmanagement.bean.ProjectResult;
import com.ls.itemmanagement.bean.UserInfo;
import com.ls.itemmanagement.common.FinalDatas;
import com.ls.itemmanagement.module.main.adapter.UserRvAdapter;
import com.ls.itemmanagement.module.main.presenter.UserPresenter;
import com.ls.itemmanagement.module.main.view.IUserView;
import com.ls.itemmanagement.module.project.activity.ProjectInfoActivity;
import com.ls.itemmanagement.module.user.activity.UserInfoActivity;
import com.ls.itemmanagement.util.ToastUtil;
import com.ls.itemmanagement.util.XUtil;

import java.util.List;

import butterknife.BindView;

public class UserFragment extends BaseFragment<UserPresenter> implements IUserView {

    @BindView(R.id.user_rv)
    RecyclerView mRvUser;
    @BindView(R.id.iv_title_left)
    ImageView mIvTitleLeft;
    @BindView(R.id.tv_title_center)
    TextView mTvTitleCenter;
    @BindView(R.id.rl_title)
    RelativeLayout mRlTitle;

    private List<UserInfo> userInfo;

    @Override
    protected UserPresenter createPresenter() {
        return new UserPresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_manage_user;
    }

    @Override
    protected void initView(View v) {
        mTvTitleCenter.setText(XUtil.getString(R.string.manage_user));
        ImmersionBar.with(this).titleBar(mRlTitle).init();
    }

    @Override
    protected void initData() {
        presenter.getAllUserInfo();
    }

    @Override
    public void getAllUsersSuccess(String msg, List<UserInfo> userInfo) {
        this.userInfo = userInfo;
        updateView();
    }

    private void updateView() {
        updateRv();
    }

    private void updateRv() {
        LinearLayoutManager lm = new LinearLayoutManager(getActivity());
        UserRvAdapter adapter = new UserRvAdapter(userInfo);
        mRvUser.setAdapter(adapter);
        mRvUser.setLayoutManager(lm);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                List<UserInfo> userInfos = adapter.getData();
                Intent intent = new Intent(getActivity(), UserInfoActivity.class);
                intent.putExtra(FinalDatas.USER_ID, userInfos.get(i).getUserId());
                startActivity(intent);
            }
        });
    }

    @Override
    public void getAllUsersFailed(String msg) {
        ToastUtil.showToast(msg);
    }
}
