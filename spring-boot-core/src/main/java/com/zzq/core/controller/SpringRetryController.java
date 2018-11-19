package com.zzq.core.controller;

import com.zzq.core.service.SpringRetryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/spring/retry")
public class SpringRetryController {

    private static final Logger logger = LoggerFactory.getLogger(SpringRetryController.class);

    @Autowired
    SpringRetryService springRetryService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() throws RuntimeException{
        springRetryService.call();
        return String.valueOf("spring retry test");
    }
}
