package com.itheima.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author ：lizonwei
 * @Date ：Created in 2020/11/11
 * @description ：
 * @version: 1.0
 */
public class TestLogger {
    //public static final Logger LOGGER = LoggerFactory.getLogger(TestLogger.class);
    //或采用下方 方式进行传值
    public static final Logger LOGGER = LoggerFactory.getLogger("log4j.properties");

    public static void main(String[] args) {
        LOGGER.debug("DEBUG方式");
        LOGGER.info("INFO方式");
        LOGGER.warn("WARN方式");
        LOGGER.error("ERROR方式");
    }
}
