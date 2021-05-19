package com.itheima.bean;

import java.lang.annotation.*;

/**
 * @Author ：lizonwei
 * @Date ：Created in 2020/11/9
 * @description ：
 * @version: 1.0
 */
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})  //此注解作用在方法，类，成员变量上上
@Retention(RetentionPolicy.RUNTIME)  //存活在运行阶段
@Inherited  //指定注解可以被继承
public @interface MyZhuJie {
    int age() default 18;

    String name() default "皮卡丘";

    String value() default "皮卡丘";

    public String className();

    public String classMethod();



}
