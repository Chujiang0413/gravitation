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
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/editEmp")
    public String editEmp(){
        return "editEmp";
    }

    @RequestMapping("/templates")
    public String httpRequest(HttpServletRequest httpServletRequest){
        httpServletRequest.setAttribute("key","Hello World!");
        return "editEmp";
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

    @RequestMapping("/getEmployeeUserInfos")
    @ResponseBody
    public EmpInfoContext getEmployeeUserInfos() throws IOException {
        List<EmployeeUserInfo> employeeInfos = employeeService.getEmployeeUserInfos();
        EmpInfoContext empInfoContext = new EmpInfoContext();
        empInfoContext.setCode(0);
        empInfoContext.setCount(10000);
        empInfoContext.setMsg("success");
        empInfoContext.setData(employeeInfos);
        return empInfoContext;
    }

    @RequestMapping("/getEmployeeUserInfo")
    @ResponseBody
    public Map<String,Object> getEmployeeUserInfo(int page, int limit) throws IOException {
        //获取员工信息
        List<EmployeeUserInfo> employeeInfos = employeeService.getEmployeeUserInfos();
        //获取分页后的员工信息
        int pageNum = (page-1)*limit;
        int pageSize = limit;
        Map<String, Object> map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<EmployeeUserInfo> employeeInfo = employeeService.getEmployeeUserList(map);

        Map<String,Object> tableData =new HashMap();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", employeeInfos.size());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", employeeInfo);
        //返回给前端
        return tableData;
    }

    @RequestMapping("/getEmployeeUserInfoById")
    @ResponseBody
    public EmployeeUserInfo getEmployeeUserInfoById (String empid) throws Exception{
        EmployeeUserInfo employeeUserInfo = employeeService.getEmployeeUserInfoById(empid);
        return employeeUserInfo;
    }

    @RequestMapping("/addEmpleyeeUserInfo")
    @ResponseBody
    public void addEmployeeUserInfo(EmployeeUserInfo employeeUserInfo){

        employeeService.addEmployeeUserInfo(employeeUserInfo);

    }


}
