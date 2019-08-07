package com.force.mall.user.mapper;

import com.force.mall.user.pojo.EmployeeInfo;
import com.force.mall.user.pojo.EmployeeUser;
import com.force.mall.user.pojo.EmployeeUserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 褚江江
 * @date 2019-07-05
 */
public interface EmployeeMapper {

    List<EmployeeInfo> selectEmployeeInfoList();

    List<EmployeeUserInfo> selectEmployeeUserInfos();

    int insertEmployeeInfo(EmployeeInfo employeeInfo);

    int insertEmployeeUser(EmployeeUser employeeUser);

    List<EmployeeUserInfo> selectEmployeeUserInfo(Map<String,Object> map);


    EmployeeUserInfo selectEmployeeUserInfoById(String empid);
}
