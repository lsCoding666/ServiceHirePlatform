package xyz.lsgdut.dhxt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.lsgdut.dhxt.pojo.BO.JoinProjectBO;
import xyz.lsgdut.dhxt.pojo.TbProject;
import xyz.lsgdut.dhxt.pojo.VO.ProjectVO;
import xyz.lsgdut.dhxt.service.CategoryService;
import xyz.lsgdut.dhxt.service.ProjectService;
import xyz.lsgdut.dhxt.utils.JSONResult;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/serviceHire/project/")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @Autowired
    CategoryService categoryService;

    //客户发布项目
    @RequestMapping("/publishProject")
    @ResponseBody
    public JSONResult publishProject(@RequestBody TbProject project, HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        TbProject project1 = projectService.publishProject(project);
        if (project1 == null) {
            return JSONResult.errorMsg("添加项目失败");
        } else {
            return JSONResult.ok(project1);
        }
    }

    //自由职业者加入项目 接取项目
    @RequestMapping("/joinProject")
    @ResponseBody
    public JSONResult joinProject(@RequestBody JoinProjectBO joinProjectBO, HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        JoinProjectBO result = projectService.joinProject(joinProjectBO);
        if (result == null) {
            return JSONResult.errorMsg("失败");
        }
        return JSONResult.ok(result);
    }

    //根据projectId查询项目信息
    @RequestMapping("/getProjectInfoById")
    @ResponseBody
    public JSONResult getProjectInfoById(@RequestBody TbProject project, HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<ProjectVO> projects = projectService.getProjectInfoById(project.getProjectId());
        if (projects.size() == 0) {
            return JSONResult.errorMsg("查询失败");
        } else {
            return JSONResult.ok(projects.get(0));
        }


    }

    //客户查询自己发布的项目
    @RequestMapping("/getMinePublishProjectInfo")
    @ResponseBody
    public JSONResult getMinePublishProjectInfo( HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<ProjectVO> projects = projectService.getMinePublishProjectInfo(userId);
        if (projects.size() == 0) {
            return JSONResult.errorMsg("查询失败");
        } else {
            return JSONResult.ok(projects);
        }
    }

    //自由职业者查询自己接的项目
    @RequestMapping("/getMineServeProjectInfo")
    @ResponseBody
    public JSONResult getMineServeProjectInfo( HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<ProjectVO> projects = projectService.getMineServeProjectInfo(userId);

        if (projects.size() == 0) {
            return JSONResult.errorMsg("查询失败");
        } else {
            return JSONResult.ok(projects);
        }
    }

    //管理员获得所有项目
    @RequestMapping("/getAllProjects")
    @ResponseBody
    public JSONResult getAllProjects( HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<ProjectVO> projects = projectService.getAllProjects();

        if (projects.size() == 0) {
            return JSONResult.errorMsg("查询失败");
        } else {
            return JSONResult.ok(projects);
        }
    }

}
