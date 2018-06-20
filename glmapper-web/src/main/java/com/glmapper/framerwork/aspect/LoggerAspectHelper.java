package com.glmapper.framerwork.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description: 注入式 也是一种通过XML方式配置的方式
 * @email: <a href="guolei.sgl@antfin.com"></a>
 * @author: guolei.sgl
 * @date: 18/6/20
 */
public class LoggerAspectHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerAspectHelper.class);

    /**
     * 调动方法前执行
     * @param point
     * @throws Throwable
     */
    public void doBefore(JoinPoint point) throws Throwable {
        LOGGER.info("before current time:"+System.currentTimeMillis());
    }

    /**
     * 在调用方法前后执行
     * @param point
     * @return
     * @throws Throwable
     */
    public Object doAround(ProceedingJoinPoint point) throws Throwable
    {
        LOGGER.info("around current time:"+System.currentTimeMillis());
        if(point.getArgs().length>0) {
            return point.proceed(point.getArgs());
        }else{
            return point.proceed();
        }
    }

    /**
     * 在调用方法之后执行
     * @param point
     * @throws Throwable
     */
    public void doAfter(JoinPoint point) throws Throwable
    {
        LOGGER.info("after current time:"+System.currentTimeMillis());
    }

    /**
     * 异常通知
     * @param point
     * @param ex
     */
    public void doThrowing(JoinPoint point, Throwable ex)
    {
        LOGGER.info("throwing current time:"+System.currentTimeMillis());
    }

}
