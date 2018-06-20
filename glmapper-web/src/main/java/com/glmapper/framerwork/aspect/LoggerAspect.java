package com.glmapper.framerwork.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description: [描述文本]
 * @email: <a href="guolei.sgl@antfin.com"></a>
 * @author: guolei.sgl
 * @date: 18/6/20
 */
public class LoggerAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerHelper.class);

    public void before(){
        LOGGER.info("before current time:"+System.currentTimeMillis());
    }

    public void afterReturning() {
        LOGGER.info("afterReturning current time:"+System.currentTimeMillis());
    }
}
