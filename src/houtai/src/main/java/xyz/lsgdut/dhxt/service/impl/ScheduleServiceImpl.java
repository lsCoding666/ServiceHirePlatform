package xyz.lsgdut.dhxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lsgdut.dhxt.mapper.TbScheduleMapper;
import xyz.lsgdut.dhxt.pojo.TbSchedule;
import xyz.lsgdut.dhxt.pojo.TbScheduleExample;
import xyz.lsgdut.dhxt.service.ScheduleService;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    TbScheduleMapper scheduleMapper;

    @Override
    public TbSchedule setSpaceTime(TbSchedule tbSchedule) {
        int i = scheduleMapper.insert(tbSchedule);
        if (i==0){
            return null;
        }else{
            return tbSchedule;
        }
    }

    @Override
    public List<TbSchedule> getSpaceTime(int userId) {
       TbScheduleExample example = new TbScheduleExample();
       TbScheduleExample.Criteria criteria = example.createCriteria();
       criteria.andUserIdEqualTo(userId);
       List<TbSchedule> scheduleList = scheduleMapper.selectByExample(example);
       return scheduleList;
    }
}
