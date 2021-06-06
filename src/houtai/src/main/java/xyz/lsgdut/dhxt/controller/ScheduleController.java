package xyz.lsgdut.dhxt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.lsgdut.dhxt.pojo.TbSchedule;
import xyz.lsgdut.dhxt.service.ScheduleService;
import xyz.lsgdut.dhxt.utils.JSONResult;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/serviceHire/schedule/")
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;

    //自由职业者设置自己的空闲时间
    @RequestMapping("/setSpaceTime")
    @ResponseBody
    public JSONResult setSpaceTime(@RequestBody TbSchedule schedule, HttpServletRequest request) {
        if (request.getSession().getAttribute("userId").toString() == null) {
            return JSONResult.errorMsg("未登录");
        }
        TbSchedule result = scheduleService.setSpaceTime(schedule);
        if (result == null) {
            return JSONResult.errorMsg("添加时间失败");
        } else {
            return JSONResult.ok(result);
        }
    }

    //查看自由职业者的空闲时间
    @RequestMapping("/getSpaceTime")
    @ResponseBody
    public JSONResult getMySpaceTime(HttpServletRequest request) {
        String userId = request.getSession().getAttribute("userId").toString();
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<TbSchedule> result = scheduleService.getSpaceTime(Integer.parseInt(userId));
        if (result == null) {
            return JSONResult.errorMsg("查询失败");
        } else {
            return JSONResult.ok(result);
        }
    }

    //查看自由职业者的空闲时间
    @RequestMapping("/getSpaceTimeById")
    @ResponseBody
    public JSONResult getSpaceTimeById(@RequestBody TbSchedule schedule,HttpServletRequest request) {
        String userId = request.getSession().getAttribute("userId").toString();
        if (userId == null) {
            return JSONResult.errorMsg("未登录");
        }
        List<TbSchedule> result = scheduleService.getSpaceTime(schedule.getUserId());
        if (result == null) {
            return JSONResult.errorMsg("查询失败");
        } else {
            return JSONResult.ok(result);
        }
    }
}
