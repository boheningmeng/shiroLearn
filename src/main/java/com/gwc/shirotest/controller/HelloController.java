package com.gwc.shirotest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.apache.log4j.Logger;
@RequestMapping("/shiro")
@Controller
public class HelloController {
    private static final Logger logger = Logger.getLogger(HelloController.class);

    @RequestMapping(path="/login",method = RequestMethod.GET)
    public String login(Model model){
        logger.info("用户进入了login");
        model.addAttribute("msg","login页面");
        return "index";
    }
    @RequestMapping(path="/index",method = RequestMethod.GET)
    public String index(Model model){
        logger.error("用户进入了index");
        model.addAttribute("msg","index页面");
        return "index";
    }
}