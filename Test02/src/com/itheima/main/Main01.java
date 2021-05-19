package com.itheima.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author ：lizonwei
 * @Date ：Created in 2020/11/11
 * @description ：
 * @version: 1.0
 */
public class Main01 {
    //public static final Logger LOGGER = LoggerFactory.getLogger("log4j.properties"); 效果和下方一样
    public static final Logger LOGGER = LoggerFactory.getLogger(Main01.class);

    public static void main(String[] args) {
        LOGGER.debug("这是debug级别的日志,debug 调试级别");
        LOGGER.info("这是info级别的日志,info 信息级别");
        LOGGER.warn("这是warn级别的日志,warn 警告级别");
        LOGGER.error("这是error级别的日志,error 错误级别");
    }
}
