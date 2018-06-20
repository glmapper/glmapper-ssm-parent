package com.glmapper.framerwork.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @description: [描述文本]
 * @email: <a href="guolei.sgl@antfin.com"></a>
 * @author: guolei.sgl
 * @date: 18/6/19
 */
public class LoggerHelper implements MethodBeforeAdvice, AfterReturningAdvice {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerHelper.class);

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        LOGGER.info("before current time:"+System.currentTimeMillis());
    }

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        LOGGER.info("afterReturning current time:"+System.currentTimeMillis());
    }
}
