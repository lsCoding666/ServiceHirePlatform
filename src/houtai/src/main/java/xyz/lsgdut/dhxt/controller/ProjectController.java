package xyz.lsgdut.dhxt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.lsgdut.dhxt.pojo.BO.JoinProjectBO;
import xyz.lsgdut.dhxt.pojo.TbProject;
import xyz.lsgdut.dhxt.service.ProjectService;
import xyz.lsgdut.dhxt.utils.JSONResult;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/serviceHire/project/")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    //客户发布项目
    @RequestMapping("/publishProject")
    @ResponseBody
    public JSONResult publishProject(@RequestBody TbProject project, HttpServletRequest request) {
        if (request.getSession().getAttribute("userId").toString() == null) {
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
        if (request.getSession().getAttribute("userId").toString() == null) {
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
        if (request.getSession().getAttribute("userId").toString() == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<TbProject> projects = projectService.getProjectInfoById(project.getProjectId());
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
        String userId = request.getSession().getAttribute("userId").toString();
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<TbProject> projects = projectService.getMinePublishProjectInfo(Integer.parseInt(userId));
        if (projects.size() == 0) {
            return JSONResult.errorMsg("查询失败");
        } else {
            return JSONResult.ok(projects.get(0));
        }
    }

    //自由职业者查询自己接的项目
    @RequestMapping("/getMineServeProjectInfo")
    @ResponseBody
    public JSONResult getMineServeProjectInfo( HttpServletRequest request) {
        String userId = request.getSession().getAttribute("userId").toString();
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<TbProject> projects = projectService.getMineServeProjectInfo(Integer.parseInt(userId));
        if (projects.size() == 0) {
            return JSONResult.errorMsg("查询失败");
        } else {
            return JSONResult.ok(projects.get(0));
        }
    }

}
