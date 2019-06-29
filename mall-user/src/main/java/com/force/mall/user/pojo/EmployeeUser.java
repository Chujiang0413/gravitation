package com.force.mall.user.pojo;

import java.io.Serializable;

public class EmployeeUser implements Serializable {

    Long   empId;
    String empUsername;
    String empPassword;
    String submissionDate;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpUsername() {
        return empUsername;
    }

    public void setEmpUsername(String empUsername) {
        this.empUsername = empUsername;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public String toString() {
        return "EmployeeUser{" +
                "empId=" + empId +
                ", empUsername='" + empUsername + '\'' +
                ", empPassword='" + empPassword + '\'' +
                ", submissionDate='" + submissionDate + '\'' +
                '}';
    }
}
