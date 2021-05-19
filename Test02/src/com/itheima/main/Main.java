package com.itheima.main;

import com.itheima.bean.Calculate;
import com.itheima.bean.Season;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author ：lizonwei
 * @Date ：Created in 2020/11/9
 * @description ：
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        //通过 枚举名.枚举项名称进行调用
        /*System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);*/

        switch (Season.WINTER) {
            case SPRING:
                System.out.println("春天："+Season.SPRING);
                break;
            case SUMMER:
                System.out.println("夏天："+Season.SUMMER);
                break;
            case AUTUMN:
                System.out.println("秋天："+Season.AUTUMN);
                break;
            case WINTER:
                System.out.println("冬天："+Season.WINTER);
                break;
            default:
                System.out.println("没有这个选项");
                break;
        }

    }


    public Calculate calculate = null;

    @Before
    public void start() {
        calculate = new Calculate();
        System.out.println("start...");
    }

    @Test
    public void test() {
        int result = calculate.add(2, 6);
        System.out.println("test...");
        //断言、预判
        Assert.assertEquals(8,result);
    }

    @After
    public void end() {
        System.out.println("end...");
    }
}
