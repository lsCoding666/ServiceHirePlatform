package xyz.lsgdut.dhxt.pojo;

import java.util.Date;

public class TbProject {
    private Integer projectId;

    private String projectName;

    private String projectHtml;

    private Date projectInsertDate;

    private Date projectStartDate;

    private String prjectEndDate;

    private Integer projectCategoryId;

    private Integer customerId;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectHtml() {
        return projectHtml;
    }

    public void setProjectHtml(String projectHtml) {
        this.projectHtml = projectHtml == null ? null : projectHtml.trim();
    }

    public Date getProjectInsertDate() {
        return projectInsertDate;
    }

    public void setProjectInsertDate(Date projectInsertDate) {
        this.projectInsertDate = projectInsertDate;
    }

    public Date getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public String getPrjectEndDate() {
        return prjectEndDate;
    }

    public void setPrjectEndDate(String prjectEndDate) {
        this.prjectEndDate = prjectEndDate == null ? null : prjectEndDate.trim();
    }

    public Integer getProjectCategoryId() {
        return projectCategoryId;
    }

    public void setProjectCategoryId(Integer projectCategoryId) {
        this.projectCategoryId = projectCategoryId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}