package xyz.lsgdut.dhxt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xyz.lsgdut.dhxt.pojo.TbRole;
import xyz.lsgdut.dhxt.service.RoleService;
import xyz.lsgdut.dhxt.utils.JSONResult;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/serviceHire/role/")
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping("/getAllRoles")
    @ResponseBody
    public JSONResult getAllRoles( HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<TbRole>  roles = roleService.getAllRoles();
        if (roles == null) {
            return JSONResult.errorMsg("失败");
        } else {
            return JSONResult.ok(roles);
        }
    }


    @GetMapping("/getRolesById")
    @ResponseBody
    public JSONResult getRolesById(@RequestBody TbRole role, HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        TbRole  role2 = roleService.getRolesById(role.getRoleId());
        if (role == null) {
            return JSONResult.errorMsg("失败");
        } else {
            return JSONResult.ok(role2);
        }
    }

    @PostMapping("/addRole")
    @ResponseBody
    public JSONResult addRole(@RequestBody TbRole role, HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        TbRole  role2 = roleService.addRole(role);
        if (role == null) {
            return JSONResult.errorMsg("失败");
        } else {
            return JSONResult.ok(role2);
        }
    }

    @PostMapping("/deleteRole")
    @ResponseBody
    public JSONResult deleteRole(@RequestBody TbRole role, HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        TbRole  role2 = roleService.deleteRole(role);
        if (role == null) {
            return JSONResult.errorMsg("失败");
        } else {
            return JSONResult.ok(role2);
        }
    }

    @PostMapping("/updateRole")
    @ResponseBody
    public JSONResult updateRole(@RequestBody TbRole role, HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        TbRole  role2 = roleService.updateRole(role);
        if (role == null) {
            return JSONResult.errorMsg("失败");
        } else {
            return JSONResult.ok(role2);
        }
    }
}
