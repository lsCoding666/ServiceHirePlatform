package xyz.lsgdut.dhxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lsgdut.dhxt.mapper.TbProjectMapper;
import xyz.lsgdut.dhxt.mapper.TbScheduleMapper;
import xyz.lsgdut.dhxt.mapper.TbSecondPartyMapper;
import xyz.lsgdut.dhxt.pojo.*;
import xyz.lsgdut.dhxt.pojo.BO.JoinProjectBO;
import xyz.lsgdut.dhxt.service.ProjectService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    TbProjectMapper projectMapper;

    @Autowired
    TbSecondPartyMapper secondPartyMapper;

    @Autowired
    TbScheduleMapper scheduleMapper;


    @Override
    public TbProject publishProject(TbProject tbProject) {
        int i = projectMapper.insert(tbProject);
        tbProject.setProjectInsertDate(new Date());
        if (i == 1) {
            return tbProject;
        } else {
            return null;
        }
    }

    @Override
    public JoinProjectBO joinProject(JoinProjectBO joinProjectBO) {
        TbSecondPartyKey secondParty = new TbSecondPartyKey();
        secondParty.setProjectId(joinProjectBO.getProject().getProjectId());
        TbSchedule schedule = joinProjectBO.getSchedule();
        secondParty.setUserId(schedule.getUserId());
        int i = secondPartyMapper.insert(secondParty);
        if (i == 0) {
            return null;
        } else {
            schedule.setProjectId(joinProjectBO.getProject().getProjectId());
            int j = scheduleMapper.updateByPrimaryKey(schedule);
            if (j==0){
                return null;
            }
            return joinProjectBO;
        }
    }

    @Override
    public List<TbProject> getProjectInfoById(int projectId) {
        TbProjectExample example = new TbProjectExample();
        TbProjectExample.Criteria criteria = example.createCriteria();
        criteria.andProjectIdEqualTo(projectId);
        List<TbProject> projects = projectMapper.selectByExample(example);
        return projects;
    }

    @Override
    public  List<TbProject>  getMineServeProjectInfo(int userId) {
        TbSecondPartyExample secondPartyExample = new TbSecondPartyExample();
        TbSecondPartyExample.Criteria criteria1 = secondPartyExample.createCriteria();
        criteria1.andUserIdEqualTo(userId);
        List<TbSecondPartyKey> secondPartyKeys = secondPartyMapper.selectByExample(secondPartyExample);

        List<Integer> projectIds = new ArrayList<>();
        for (TbSecondPartyKey secondPartyKey : secondPartyKeys) {
            projectIds.add(secondPartyKey.getProjectId());
        }

        TbProjectExample example = new TbProjectExample();
        TbProjectExample.Criteria criteria = example.createCriteria();
        criteria.andProjectIdIn(projectIds);
        List<TbProject> projects = projectMapper.selectByExample(example);

        return projects;
    }

    @Override
    public List<TbProject> getAllProjects() {
        TbProjectExample example = new TbProjectExample();
        TbProjectExample.Criteria criteria = example.createCriteria();
        criteria.andProjectIdIsNotNull();
        List<TbProject> projects = projectMapper.selectByExample(example);
        return projects;
    }

    @Override
    public  List<TbProject> getMinePublishProjectInfo(int userId) {
        TbProjectExample example = new TbProjectExample();
        TbProjectExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerIdEqualTo(userId);
        List<TbProject> projects = projectMapper.selectByExample(example);

        return projects;
    }
}
