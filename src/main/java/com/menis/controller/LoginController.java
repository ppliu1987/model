package com.menis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/loginHandler")
public class LoginController {
    protected static Logger logger = LoggerFactory.getLogger(LoginController.class);
    //去往登录页
    @RequestMapping("/toLogin")
    public String toLogin(){
        logger.info("进入登录页");
        return "test/testview";
    }
    //登录方法
    @RequestMapping("/userLogin")
    public String userLogin(@RequestParam("name=userNm")String userNm,@RequestParam("name=passwd")String passwd){
        if("ppliu".equals(userNm)&&"123456".equals(passwd)){
            return "登录成功";
        }
        return "登录失败";
    }
}