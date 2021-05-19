package com.itheima.bean;

import org.junit.Test;

/**
 * @Author ：lizonwei
 * @Date ：Created in 2020/11/9
 * @description ：
 * @version: 1.0
 */
public class Cat {
    String string;
    public void sleep() {
        System.out.println("猫咪正在睡觉");
    }

    @Test
    private void work() {
        System.out.println("猫咪已经起床开始抓老鼠了");
    }
}
