package com.force.mall.user.mapper;

import com.force.mall.user.pojo.EmployeeInfo;
import com.force.mall.user.pojo.EmployeeUser;
import com.force.mall.user.pojo.EmployeeUserInfo;

import java.util.List;
import java.util.Map;

/**
 * @author 褚江江
 * @date 2019-07-05
 */
public interface EmployeeMapper {

    //查询用户信息
    List<EmployeeInfo> selectEmployeeInfoList();

    //查询用户所有信息
    List<EmployeeUserInfo> selectEmployeeUserInfos();

    //查询用户信息ById
    EmployeeUserInfo selectEmployeeUserInfoById(String empid);

    //分页查询
    List<EmployeeUserInfo> selectEmployeeUserInfo(Map<String,Object> map);

    //插入employee_info
    int insertEmployeeInfo(EmployeeInfo employeeInfo);

    //插入employee_user
    int insertEmployeeUser(EmployeeUser employeeUser);

    //查询用户信息map接收
    List<Map<String,Object>> employeeUserInfos();


}
