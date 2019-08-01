package com.force.mall.user.resource;

import com.force.mall.user.context.EmpContext;
import com.force.mall.user.context.EmpInfoContext;
import com.force.mall.user.pojo.EmployeeInfo;
import com.force.mall.user.pojo.EmployeeUserInfo;
import com.force.mall.user.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
/**
 * @author 褚江江
 * @date 2019-07-05
 */
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
        return "empList";
    }


    @RequestMapping("/getEmployeeList")
    @ResponseBody
    public EmpContext getEmployeeList(){
        List<EmployeeInfo> employeelist =  employeeService.getEmployeeList();
        EmpContext empContext = new EmpContext();
        empContext.setCode(0);
        empContext.setCount(10000);
        empContext.setMsg("success");
        empContext.setData(employeelist);
        return empContext;
    }
    @RequestMapping("/getEmployeeUserInfo")
    @ResponseBody
    public EmpInfoContext getEmployeeUserInfo(){
        List<EmployeeUserInfo> employeeInfos = employeeService.getEmployeeUserList();
        EmpInfoContext empInfoContext = new EmpInfoContext();
        empInfoContext.setCode(0);
        empInfoContext.setCount(10000);
        empInfoContext.setMsg("success");
        empInfoContext.setData(employeeInfos);
        return empInfoContext;
    }

    @RequestMapping("/addEmpleyeeUserInfo")
    @ResponseBody
    public void addEmployeeUserInfo(EmployeeUserInfo employeeUserInfo){

        employeeService.addEmployeeUserInfo(employeeUserInfo);

    }


}
