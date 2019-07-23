package com.menis.controller;

import com.menis.service.IMenisUserService;
import com.menis.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/loginHandler")
public class LoginController {
    protected static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    IMenisUserService userService;

    //去往登录页
    @RequestMapping("/toLogin")
    public String toLogin(){
        logger.info("进入登录页");
        return "test/testview";
    }
    //登录方法
    @ResponseBody
    @RequestMapping("/userLogin")
    public String userLogin(@RequestParam(name="userNm")String userNm,@RequestParam(name="passwd")String passwd){
        if("ppliu".equals(userNm)&&"123456".equals(passwd)){
            return "登录成功";
        }
        return "登录失败";
    }

    @ResponseBody
    @RequestMapping("/getUser")
    public String getUser(){
        UserVo user = userService.getUserByMblNo("13311011971");
        logger.info("获取用户信息为:"+user.toString());
        return user.getIdCard();
    }
}