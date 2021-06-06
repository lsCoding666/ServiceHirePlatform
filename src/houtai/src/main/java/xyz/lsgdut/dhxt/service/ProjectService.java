package xyz.lsgdut.dhxt.service;

import xyz.lsgdut.dhxt.pojo.BO.JoinProjectBO;
import xyz.lsgdut.dhxt.pojo.TbProject;
import xyz.lsgdut.dhxt.pojo.VO.ProjectVO;

import java.util.List;

public interface ProjectService {
    //客户发布项目
    TbProject publishProject(TbProject tbProject);

    //自由职业者加入项目 接取项目
    public JoinProjectBO joinProject(JoinProjectBO joinProjectBO);

    //根据projectId查询项目信息
    List<ProjectVO> getProjectInfoById(int projectId);

    //客户查询自己发布的项目
    List<ProjectVO> getMinePublishProjectInfo(int userId);

    //自由职业者查询自己接的项目
    List<ProjectVO> getMineServeProjectInfo(int userId);

    //管理员获得所有项目
    List<ProjectVO> getAllProjects();

}
