package com.force.mall.user.service.impl;

import com.force.mall.user.pojo.EmployeeInfo;
import com.force.mall.user.mapper.EmployeeMapper;
import com.force.mall.user.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeInfo> getEmployeeList() {
        List<EmployeeInfo> employeeList = employeeMapper.selectEmployeeInfoList();
        return employeeList;
    }
}
