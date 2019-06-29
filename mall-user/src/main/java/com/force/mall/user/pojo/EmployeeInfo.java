package com.force.mall.user.pojo;

import java.io.Serializable;
import java.util.List;

public class EmployeeInfo implements Serializable {
    Long   empId;
    String empName;
    String empSex;
    int    empAge;
    String empEmail;
    String empAddress;
    List<EmployeeUser> employeeUser;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public List<EmployeeUser> getEmployeeUser() {
        return employeeUser;
    }

    public void setEmployeeUser(List<EmployeeUser> employeeUser) {
        this.employeeUser = employeeUser;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSex='" + empSex + '\'' +
                ", empAge=" + empAge +
                ", empEmail='" + empEmail + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", employeeUser=" + employeeUser +
                '}';
    }
}
