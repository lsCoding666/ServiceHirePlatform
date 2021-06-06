package xyz.lsgdut.dhxt.pojo.BO;

import xyz.lsgdut.dhxt.pojo.TbProject;
import xyz.lsgdut.dhxt.pojo.TbSchedule;

public class JoinProjectBO {
    TbProject project;
    TbSchedule schedule;

    public TbProject getProject() {
        return project;
    }

    public void setProject(TbProject project) {
        this.project = project;
    }

    public TbSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(TbSchedule schedule) {
        this.schedule = schedule;
    }
}
