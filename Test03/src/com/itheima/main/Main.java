package com.itheima.main;

import com.itheima.bean.Season;

/**
 * @Author ：lizonwei
 * @Date ：Created in 2020/11/11
 * @description ：
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Season key = Season.WINTER;

        switch (key) {
            case SPRING:
                System.out.println("SPRING：春天");
                break;
            case SUMMER:
                System.out.println("SUMMER：夏天");
                break;
            case AUTUMN:
                System.out.println("AUTUMN：秋天");
                break;
            case WINTER:
                System.out.println("WINTER：冬天");
                break;
            default:
                System.out.println("没有该季节");
                break;
        }

    }
}
