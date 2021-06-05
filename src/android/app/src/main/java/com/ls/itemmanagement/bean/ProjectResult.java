package com.ls.itemmanagement.bean;

public class ProjectResult {

    private int projectId;
    private String projectName;
    private String projectHtml;
    private Object projectInsertDate;
    private Object projectStartDate;
    private Object prjectEndDate;
    private int projectCategoryId;
    private int customerId;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectHtml() {
        return projectHtml;
    }

    public void setProjectHtml(String projectHtml) {
        this.projectHtml = projectHtml;
    }

    public Object getProjectInsertDate() {
        return projectInsertDate;
    }

    public void setProjectInsertDate(Object projectInsertDate) {
        this.projectInsertDate = projectInsertDate;
    }

    public Object getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(Object projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public Object getPrjectEndDate() {
        return prjectEndDate;
    }

    public void setPrjectEndDate(Object prjectEndDate) {
        this.prjectEndDate = prjectEndDate;
    }

    public int getProjectCategoryId() {
        return projectCategoryId;
    }

    public void setProjectCategoryId(int projectCategoryId) {
        this.projectCategoryId = projectCategoryId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
