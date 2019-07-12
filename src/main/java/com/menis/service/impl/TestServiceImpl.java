package com.menis.service.impl;

import com.menis.service.ITestService;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements ITestService {
    @Override
    public String serviceMethod(String name) {
        return "Your name is:" + name;
    }
}