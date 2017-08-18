package com.gwc.shirotest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by GWCheng on 2016/3/9.
 */
@Controller
public class ErrorController {
    @RequestMapping(value = "/error/unauthorized")
    public String unauthorized(){
        return "/error/unauthorized";
    }
}
