package com.force.mall.user.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
/**
 * @author 褚江江
 * @date 2019-07-05
 */
@Data
public class EmployeeInfo implements Serializable {
    Long empId;
    String empName;
    String empSex;
    int empAge;
    String empEmail;
    String empAddress;
    List<EmployeeUser> employeeUser;
}
