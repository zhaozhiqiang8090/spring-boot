/**
 * 
 */
package com.zzq.basic.java.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 类的详细说明
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年5月2日 下午1:08:19
 */
public class LogTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        LOGGER.trace("logtest的--trace日志--输出了");
        LOGGER.debug("logtest的--debug日志--输出了");
        LOGGER.info("logtest的--info日志--输出了");
        LOGGER.warn("logtest的--warn日志--输出了");
        LOGGER.error("logtest的--error日志--输出了");
    }
}
