package com.force.mall.user.mapper;

import com.force.mall.user.pojo.EmployeeInfo;
import com.force.mall.user.pojo.EmployeeUser;
import com.force.mall.user.pojo.EmployeeUserInfo;

import java.util.List;
/**
 * @author 褚江江
 * @date 2019-07-05
 */
public interface EmployeeMapper {

    List<EmployeeInfo> selectEmployeeInfoList();

    List<EmployeeUserInfo> selectEmployeeUserInfo();

    int insertEmployeeInfo(EmployeeInfo employeeInfo);

    int insertEmployeeUser(EmployeeUser employeeUser);
}
