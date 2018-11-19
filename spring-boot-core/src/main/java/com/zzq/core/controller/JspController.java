package com.zzq.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class JspController {

    private static final Logger logger = LoggerFactory.getLogger(SpringRetryController.class);

    /*
    jsp页面访问
    启动方式：Maven Projects - 模块 - Plugins - spring-boot - spring-boot:run
     */
    @RequestMapping("/success")
    public String success(Model model) {
        model.addAttribute("hehe", "呵呵");
        return "success";
    }

}
