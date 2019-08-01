package com.force.mall.user.service;

import com.force.mall.user.pojo.EmployeeInfo;
import com.force.mall.user.pojo.EmployeeUserInfo;

import java.sql.SQLException;
import java.util.List;

/**
 * @author 褚江江
 * @date 2019-07-05
 */
public interface EmployeeService {

    List<EmployeeInfo> getEmployeeList();

    List<EmployeeUserInfo> getEmployeeUserList();

    void addEmployeeUserInfo(EmployeeUserInfo employeeUserInfo);
}
