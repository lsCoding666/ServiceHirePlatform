package xyz.lsgdut.dhxt.pojo;

import java.util.Date;

public class TbAgreement {
    private Integer agreementId;

    private Date agreementSignDate;

    private Date agreementStartDate;

    private Date agreementEndDate;

    private String agreementHtml;

    public Integer getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(Integer agreementId) {
        this.agreementId = agreementId;
    }

    public Date getAgreementSignDate() {
        return agreementSignDate;
    }

    public void setAgreementSignDate(Date agreementSignDate) {
        this.agreementSignDate = agreementSignDate;
    }

    public Date getAgreementStartDate() {
        return agreementStartDate;
    }

    public void setAgreementStartDate(Date agreementStartDate) {
        this.agreementStartDate = agreementStartDate;
    }

    public Date getAgreementEndDate() {
        return agreementEndDate;
    }

    public void setAgreementEndDate(Date agreementEndDate) {
        this.agreementEndDate = agreementEndDate;
    }

    public String getAgreementHtml() {
        return agreementHtml;
    }

    public void setAgreementHtml(String agreementHtml) {
        this.agreementHtml = agreementHtml == null ? null : agreementHtml.trim();
    }
}