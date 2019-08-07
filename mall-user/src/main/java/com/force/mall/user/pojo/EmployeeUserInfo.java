package com.force.mall.user.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 褚江江
 * @date 2019-07-05
 */
@Data
public class EmployeeUserInfo implements Serializable {

    private static final long serialVersionUID = 8634759486834261430L;

    private String empId;
    private String empAge;
    private String empSex;
    private String empName;
    private String empEmail;
    private String empAddress;
    private String empUsername;
    private String empPassword;
    private String submissionDate;
    private  String msg = "成功";

}
