package xyz.lsgdut.dhxt.service;

import xyz.lsgdut.dhxt.pojo.BO.JoinProjectBO;
import xyz.lsgdut.dhxt.pojo.TbProject;

import java.util.List;

public interface ProjectService {
    //客户发布项目
    TbProject publishProject(TbProject tbProject);

    //自由职业者加入项目 接取项目
    public JoinProjectBO joinProject(JoinProjectBO joinProjectBO);

    //根据projectId查询项目信息
    List<TbProject> getProjectInfoById(int projectId);

    //客户查询自己发布的项目
    List<TbProject> getMinePublishProjectInfo(int userId);

    //自由职业者查询自己接的项目
    List<TbProject> getMineServeProjectInfo(int userId);
}
