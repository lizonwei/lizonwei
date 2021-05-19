package com.itheima.bean;

import java.lang.annotation.*;

/**
 * @Author ：lizonwei
 * @Date ：Created in 2020/11/9
 * @description ：
 * @version: 1.0
 */
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE}) //说明此注解可用于在 成员变量 成员方法 及类上
@Retention(RetentionPolicy.RUNTIME)  //指定注解的存活时间为运行时
@Inherited  //说明此注解可以被继承
public @interface MyAnnotation {
    public String className();

    public String classMethod();
}
