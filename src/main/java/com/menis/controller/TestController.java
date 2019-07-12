package com.menis.controller;

import com.menis.service.ITestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testHandler")
public class TestController {
    protected static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    ITestService testService;

    @RequestMapping("/testMethod")
    @ResponseBody
    public String test(){
        logger.info("来了老弟啊啊啊!");
        return "haha";
    }

    @RequestMapping("/serviceMethod")
    public String serviceMethod(@RequestParam(name="name")String name){
        logger.info("传入的名称为:"+name);
        String ret = testService.serviceMethod(name);
        return ret;
    }

}