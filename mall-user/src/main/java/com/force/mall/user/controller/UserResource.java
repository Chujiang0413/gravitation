package com.force.mall.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserResource {

    @RequestMapping("/checkup")
    @ResponseBody
    public String index(){
        return "successfully!";
    }


}
