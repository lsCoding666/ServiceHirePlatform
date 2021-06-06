package xyz.lsgdut.dhxt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.lsgdut.dhxt.pojo.TbTradeCategory;
import xyz.lsgdut.dhxt.pojo.TbUser;
import xyz.lsgdut.dhxt.service.CategoryService;
import xyz.lsgdut.dhxt.utils.JSONResult;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/serviceHire/category/")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    //根据类型获得自由职业者
    @RequestMapping("/getFreeUserByCategoryId")
    @ResponseBody
    public JSONResult getFreeUserByCategoryId(@RequestBody TbTradeCategory category, HttpServletRequest request) {
        if (request.getSession().getAttribute("userId").toString() == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<TbUser> result = categoryService.getFreeUserByCategoryId(category.getCategoryId());
        if (result == null) {
            return JSONResult.errorMsg("查询失败");
        } else {
            return JSONResult.ok(result);
        }
    }

//    //根据类型获得项目
//    @RequestMapping("/getProjectByCategoryId")
//    @ResponseBody
//    public JSONResult getProjectByCategoryId(@RequestBody TbTradeCategory category, HttpServletRequest request) {
//        if (request.getSession().getAttribute("userId").toString() == null) {
//            return JSONResult.errorMsg("未登录");
//        }
//        List<TbProject> result = categoryService.getProjectByCategoryId(category.getCategoryId());
//        if (result == null) {
//            return JSONResult.errorMsg("查询失败");
//        } else {
//            return JSONResult.ok(result);
//        }
//    }

    //根据类型获得客户
    @RequestMapping("/getCustomerByCategoryId")
    @ResponseBody
    public JSONResult getCustomerByCategoryId(@RequestBody TbTradeCategory category, HttpServletRequest request) {
        if (request.getSession().getAttribute("userId").toString() == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<TbUser> result = categoryService.getCustomerByCategoryId(category.getCategoryId());
        if (result == null) {
            return JSONResult.errorMsg("查询失败");
        } else {
            return JSONResult.ok(result);
        }
    }

    //根据类型获得客户
    @RequestMapping("/addCategory")
    @ResponseBody
    public JSONResult addCategory(@RequestBody TbTradeCategory category, HttpServletRequest request) {
        if (request.getSession().getAttribute("userId").toString() == null) {
            return JSONResult.errorMsg("未登录");
        }
        TbTradeCategory result = categoryService.addCategory(category);
        if (result == null) {
            return JSONResult.errorMsg("插入失败");
        } else {
            return JSONResult.ok(result);
        }
    }

    //删除分类
    @RequestMapping("/delegateCategory")
    @ResponseBody
    public JSONResult delegateCategory(@RequestBody TbTradeCategory category, HttpServletRequest request) {
        if (request.getSession().getAttribute("userId").toString() == null) {
            return JSONResult.errorMsg("未登录");
        }
        TbTradeCategory result = categoryService.delegateCategory(category);
        if (result == null) {
            return JSONResult.errorMsg("删除失败");
        } else {
            return JSONResult.ok(result);
        }
    }

    //删除分类
    @RequestMapping("/updateCategory")
    @ResponseBody
    public JSONResult updateCategory(@RequestBody TbTradeCategory category, HttpServletRequest request) {
        if (request.getSession().getAttribute("userId").toString() == null) {
            return JSONResult.errorMsg("未登录");
        }
        TbTradeCategory result = categoryService.updateCategory(category);
        if (result == null) {
            return JSONResult.errorMsg("更新失败");
        } else {
            return JSONResult.ok(result);
        }
    }

    //删除分类
    @RequestMapping("/getAllCategories")
    @ResponseBody
    public JSONResult getAllCategories(HttpServletRequest request) {
        String userId = request.getSession().getAttribute("userId").toString();
        if (request.getSession().getAttribute("userId").toString() == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<TbTradeCategory> result = categoryService.getAllCategories();
        if (result.size()==0 ) {
            return JSONResult.errorMsg("查询失败");
        } else {
            return JSONResult.ok(result);
        }
    }
}
