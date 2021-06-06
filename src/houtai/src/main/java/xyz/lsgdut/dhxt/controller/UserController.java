package xyz.lsgdut.dhxt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.lsgdut.dhxt.pojo.TbUser;
import xyz.lsgdut.dhxt.service.UserService;
import xyz.lsgdut.dhxt.utils.JSONResult;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/serviceHire/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userLogin")
    @ResponseBody
    public JSONResult userLogin(@RequestBody TbUser user, HttpServletRequest request) {
        List<TbUser> list = userService.userLogin(user.getUserName(), user.getUserPassword());
        if (list.size() == 0) {
            return JSONResult.errorMsg("登录失败");
        } else {
            request.getSession().setAttribute("userId", list.get(0).getUserId());
            return JSONResult.ok(list.get(0));
        }
    }

    @RequestMapping("/userRegister")
    @ResponseBody
    public JSONResult userRegister(@RequestBody TbUser user, HttpServletRequest request) {
        String result = userService.userRegister(user);
        return JSONResult.ok(result);
    }

    @RequestMapping("/show")
    @ResponseBody
    public JSONResult show(HttpServletRequest request) {
        String userId = request.getSession().getAttribute("userId").toString();
        TbUser user = userService.queryByUserId(Integer.parseInt(userId));
        if (userId.length() == 0) {
            return JSONResult.errorMsg("请先登录");
        }
        if (user != null) {
            return JSONResult.ok(user);
        } else {
            return JSONResult.errorMsg("未登录");
        }
    }


    @RequestMapping("/getUserInfoById")
    @ResponseBody
    public JSONResult getUserInfoById(TbUser user, HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        TbUser user2 = userService.queryByUserId(userId);
        if (user2 == null) {
            return JSONResult.errorMsg("查询失败");
        } else {
            return JSONResult.ok(user2);
        }
    }

    @RequestMapping("/getAllUsers")
    @ResponseBody
    public JSONResult getAllUsers(HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<TbUser> users = userService.getAllUsers();
        return JSONResult.ok(users);
    }


    @RequestMapping("/getAllCustomers")
    @ResponseBody
    public JSONResult getAllCustomers(HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<TbUser> users = userService.getAllCustomers();
        return JSONResult.ok(users);
    }

    @RequestMapping("/getAllServers")
    @ResponseBody
    public JSONResult getAllServers(HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<TbUser> users = userService.getAllServers();
        return JSONResult.ok(users);
    }


    @RequestMapping("/getAllAdmins")
    @ResponseBody
    public JSONResult getAllAdmins(HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<TbUser> users = userService.getAllAdmins();
        return JSONResult.ok(users);
    }

    @RequestMapping("/getAllEmployee")
    @ResponseBody
    public JSONResult getAllEmployee(HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<TbUser> users = userService.getAllEmployee();
        return JSONResult.ok(users);
    }
}
