package com.itheima.main;

import com.itheima.bean.Calculation;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author ：lizonwei
 * @Date ：Created in 2020/11/11
 * @description ：
 * @version: 1.0
 */
public class TestCalculation {
    public static Calculation calculation = null;

    @Before
    public void start() {
        calculation = new Calculation();
        System.out.println("对象初始化完成");
    }

    @Test
    public void testOne() {
        int result = calculation.addition(10, 20);
        Assert.assertEquals(30,result);
    }

    @Test
    public void  testTwo() {
        int result = calculation.subtraction(10, 20);
        Assert.assertEquals(-10, result);
    }

    @After
    public void end() {
        System.out.println("资源释放完成");
    }
}
