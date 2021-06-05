package xyz.lsgdut.dhxt.service;

import xyz.lsgdut.dhxt.pojo.TbSchedule;

import java.util.List;

public interface ScheduleService {
    //自由职业者设置自己的空闲时间
    TbSchedule setSpaceTime(TbSchedule tbSchedule);

    //查看自由职业者的空闲时间
    List<TbSchedule> getSpaceTime(int userId);
}
