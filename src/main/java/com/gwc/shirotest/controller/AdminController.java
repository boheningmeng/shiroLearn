package com.gwc.shirotest.controller;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by GWCheng on 2016/3/8.
 */
@Controller
public class AdminController {
    @RequestMapping(value = "/admin/home")
    public String adminHomePage(){
        return "admin/home";
    }

    @RequiresRoles("admin")
    @RequestMapping(value = "/admin/role")
    public String adminWithRole(){
        return "admin/withrole";
    }

    @RequiresPermissions(value={"user:view","user:create"}, logical= Logical.OR)
    @RequestMapping(value = "/admin/auth")
    public String adminWithAuth(){
        return "admin/withauth";
    }
}
