package com.menis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/testHandler")
public class TestController {
    @RequestMapping("/testMethod")
    @ResponseBody
    public String test(){
        return "haha";
    }
}