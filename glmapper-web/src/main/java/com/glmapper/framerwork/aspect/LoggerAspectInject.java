package com.glmapper.framerwork.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @description: 使用Aspect注解驱动的方式
 * @email: <a href="guolei.sgl@antfin.com"></a>
 * @author: guolei.sgl
 * @date: 18/6/20
 */
@Aspect
@Component
public class LoggerAspectInject {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerAspectInject.class);

    @Pointcut("execution(* com.glmapper.framerwork.service.impl.*.*(..))")
    public void cutIn(){}

    @Before("cutIn()")
    public void before(){
        LOGGER.info("before current time:"+System.currentTimeMillis());
    }

    @AfterReturning("cutIn()")
    public void AfterReturning(){
        LOGGER.info("afterReturning current time:"+System.currentTimeMillis());
    }
}
