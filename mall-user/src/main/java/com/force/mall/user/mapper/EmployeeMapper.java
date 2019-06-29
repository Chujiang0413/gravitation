package com.force.mall.user.mapper;

import com.force.mall.user.pojo.EmployeeInfo;

import java.util.List;

public interface EmployeeMapper {

    List<EmployeeInfo> selectEmployeeInfoList();
}
