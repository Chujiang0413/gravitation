package com.force.mall.user.service.impl;

import com.force.mall.user.mapper.EmployeeMapper;
import com.force.mall.user.pojo.EmployeeInfo;
import com.force.mall.user.pojo.EmployeeUser;
import com.force.mall.user.pojo.EmployeeUserInfo;
import com.force.mall.user.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
/**
 * @author 褚江江
 * @date 2019-07-05
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeInfo> getEmployeeList() {
        List<EmployeeInfo> employeeList = employeeMapper.selectEmployeeInfoList();
        return employeeList;
    }

    @Override
    public List<EmployeeUserInfo> getEmployeeUserList() {
        List<EmployeeUserInfo> employeeInfos = employeeMapper.selectEmployeeUserInfo();
        return employeeInfos;
    }

    @Override
    public void addEmployeeUserInfo(EmployeeUserInfo employeeUserInfo) {

        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setEmpId(Long.valueOf(employeeUserInfo.getEmpId()));
        employeeInfo.setEmpAge(Integer.valueOf(employeeUserInfo.getEmpAge()));
        employeeInfo.setEmpSex(employeeUserInfo.getEmpSex());
        employeeInfo.setEmpName(employeeUserInfo.getEmpName());
        employeeInfo.setEmpEmail(employeeUserInfo.getEmpEmail());
        employeeInfo.setEmpAddress(employeeUserInfo.getEmpAddress());
        int info = employeeMapper.insertEmployeeInfo(employeeInfo);

        EmployeeUser employeeUser = new EmployeeUser();
        employeeUser.setEmpId(Long.valueOf(employeeUserInfo.getEmpId()));
        employeeUser.setEmpUsername(employeeUserInfo.getEmpUsername());
        employeeUser.setEmpPassword(employeeUserInfo.getEmpPassword());
        employeeUser.setSubmissionDate(employeeUserInfo.getSubmissionDate());
        int user = employeeMapper.insertEmployeeUser(employeeUser);

        if(info==0){
            System.out.println("info插入失败！");
        }
        if(user==0){
            System.out.println("user插入失败！");
        }
        if (info==0||user==0) {
            System.out.println("程序错误！");
        }
        if (info==1||user==1) {
            System.out.println("successfully！");
        }
    }
}
