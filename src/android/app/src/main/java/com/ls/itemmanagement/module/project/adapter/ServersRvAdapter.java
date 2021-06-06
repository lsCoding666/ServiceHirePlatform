package com.ls.itemmanagement.module.project.adapter;

import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.ls.itemmanagement.R;
import com.ls.itemmanagement.bean.ProjectResult;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ServersRvAdapter  extends BaseQuickAdapter<ProjectResult.ServesDTO, BaseViewHolder> {

    private List<ProjectResult.ServesDTO> servers = new ArrayList<>();

    public ServersRvAdapter(@Nullable List<ProjectResult.ServesDTO> data) {
        super(R.layout.view_server, data);
    }



    @Override
    protected void convert(@NonNull @NotNull BaseViewHolder baseViewHolder, ProjectResult.ServesDTO servesDTO) {
        baseViewHolder.setText(R.id.server_name_tv, servesDTO.getUserName());
    }
}