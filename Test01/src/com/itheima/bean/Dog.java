package com.itheima.bean;

import org.junit.Test;

/**
 * @Author ：lizonwei
 * @Date ：Created in 2020/11/9
 * @description ：
 * @version: 1.0
 */
public class Dog {
    public void sleep() {
        System.out.println("小狗正在睡觉");
    }

    @Test
    private void work() {
        System.out.println("小狗已经起床看家了");
    }

    public int add(int num) {
        return num*num;
    }
}
