package com.ls.itemmanagement.module.main.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.ls.itemmanagement.R;
import com.ls.itemmanagement.bean.UserInfo;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class UserRvAdapter extends BaseQuickAdapter<UserInfo, BaseViewHolder> {
    public UserRvAdapter( @Nullable @org.jetbrains.annotations.Nullable List<UserInfo> data) {
        super(R.layout.view_user, data);
    }

    @Override
    protected void convert(@NonNull @NotNull BaseViewHolder baseViewHolder, UserInfo userInfo) {
        baseViewHolder.setText(R.id.user_name_tv,userInfo.getUserName()+userInfo.getRoleId()+userInfo.getRoleName());
    }
}
