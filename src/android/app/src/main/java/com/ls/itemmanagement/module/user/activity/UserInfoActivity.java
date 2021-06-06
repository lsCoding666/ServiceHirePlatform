package com.ls.itemmanagement.module.user.activity;

import android.content.Intent;
import android.widget.TextView;

import com.ls.itemmanagement.R;
import com.ls.itemmanagement.base.BaseActivity;
import com.ls.itemmanagement.base.BasePresenter;
import com.ls.itemmanagement.bean.UserInfo;
import com.ls.itemmanagement.common.FinalDatas;
import com.ls.itemmanagement.module.main.presenter.UserPresenter;

import com.ls.itemmanagement.module.user.view.IUserView;
import com.ls.itemmanagement.module.user.presenter.UserInfoPresenter;

import org.w3c.dom.Text;

import java.util.List;

import butterknife.BindView;

public class UserInfoActivity extends BaseActivity<UserInfoPresenter> implements IUserView {
    @BindView(R.id.user_name_tv)
    TextView mTvUserName;
    @BindView(R.id.sex_tv)
    TextView mTvSex;
    @BindView(R.id.phoneNum_tv)
    TextView mTvPhone;
    @BindView(R.id.wechat_tv)
    TextView mTvWeChat;
    @BindView(R.id.email_tv)
    TextView mTvEmail;
    @BindView(R.id.user_category_tv)
    TextView mTvUserCategory;
    @BindView(R.id.user_role_tv)
    TextView mTVUserRole;
    @BindView(R.id.title_bar_text)
    TextView mTvTittle;

    private int userID;
    private UserInfo userInfo;

    @Override
    protected UserInfoPresenter createPresenter() {
        return new UserInfoPresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_user_info;
    }

    @Override
    protected void initView() {
        mTvTittle.setText("用户信息");
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        userID = intent.getIntExtra(FinalDatas.USER_ID,-1);
        presenter.getuserInfoById(userID);
    }

    @Override
    public void initStatusBar() {

    }

    @Override
    public void getAllUsersSuccess(String msg, List<UserInfo> userInfo) {

    }

    @Override
    public void getAllUsersFailed(String msg) {

    }

    @Override
    public void getUserInfoSuccess(String msg, UserInfo userInfo) {
        this.userInfo = userInfo;
        updateView();
    }

    private void updateView() {
        mTvEmail.setText(userInfo.getUserEmailAddress());
        mTVUserRole.setText(userInfo.getRoleName());
        mTvSex.setText(userInfo.getUserSex());
        mTvPhone.setText(userInfo.getUserPhoneNum());
        mTvWeChat.setText(userInfo.getUserWechat());
        mTvUserCategory.setText(userInfo.getCategory().getCategoryName());
        mTvUserName.setText(userInfo.getUserName());
    }

    @Override
    public void getUserInfoFailed(String msg) {

    }
}
