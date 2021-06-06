package xyz.lsgdut.dhxt.pojo.VO;

import com.fasterxml.jackson.annotation.JsonFormat;
import xyz.lsgdut.dhxt.pojo.TbProject;

import java.util.Date;
import java.util.List;

public class ProjectVO {
    private Integer projectId;

    private String projectName;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date projectInsertDate;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date projectStartDate;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date projectEndDate;

    private Integer projectCategoryId;

    private Integer customerId;

    List<UserVO> serves;

    public List<UserVO> getServes() {
        return serves;
    }

    public void setServes(List<UserVO> serves) {
        this.serves = serves;
    }

    public UserVO getCustomer() {
        return customer;
    }

    public void setCustomer(UserVO customer) {
        this.customer = customer;
    }

    private UserVO customer;


    private String html;

    private String categoryName;

    public ProjectVO(TbProject project, String categoryName, UserVO customer) {
        this.projectCategoryId = project.getProjectCategoryId();
        this.categoryName = categoryName;
        this.projectId = project.getProjectId();
        this.projectInsertDate = project.getProjectInsertDate();
        this.projectStartDate = project.getProjectStartDate();
        this.projectEndDate = project.getProjectEndDate();
        this.customerId = project.getCustomerId();
        this.customer = customer;
        this.html = project.getHtml();
        this.projectName = project.getProjectName();
    }

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
        this.projectName = projectName;
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

    public Date getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(Date projectEndDate) {
        this.projectEndDate = projectEndDate;
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

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
