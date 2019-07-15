package com.menis.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAdvice {
    private static Logger logger = LoggerFactory.getLogger(AroundAdvice.class);

    @Around("execution (* com.menis.controller..*(..))")
    public Object watchPerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        //计算方法运行时间
        Long time1 = System.currentTimeMillis();
        Object obj = joinPoint.proceed();
        Long time2 = System.currentTimeMillis();
        Long  runTime = time2 - time1;

        //获取方法签名
        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();

        logger.info("方法:"+methodName+"所用时间为"+runTime+"毫秒");
        return obj;
    }
}