package com.force.mall.user.resource;

import com.force.mall.user.pojo.EmployeeInfo;
import com.force.mall.user.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserResource {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/checkup")
    @ResponseBody
    public String checkup(){
        return "successfully!!!!!!";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/templates")
    public String httpRequest(HttpServletRequest httpServletRequest){
        httpServletRequest.setAttribute("key","Hello World!");
        return "index1";
    }


    @RequestMapping("/getEmployeeList")
    @ResponseBody
    public List<EmployeeInfo> getEmployeeList(){
        List<EmployeeInfo> employeelist =  employeeService.getEmployeeList();
        return employeelist;
    }

}
