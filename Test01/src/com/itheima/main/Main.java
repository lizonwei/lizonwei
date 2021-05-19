package com.itheima.main;

import com.itheima.bean.MyAnnotation;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author ：lizonwei
 * @Date ：Created in 2020/11/9
 * @description ：
 * @version: 1.0
 */
@MyAnnotation(className = "com.itheima.bean.Cat", classMethod = "work")
public class Main {
    public static void main(String[] args) throws Exception {
        //通过本类的字节码对象获取注解对象
        MyAnnotation annotation = Main.class.getAnnotation(MyAnnotation.class);
        //通过注解对象获取注解内容
        String className = annotation.className();
        String classMethod = annotation.classMethod();

        //反射创建注解内的类对象
        Class aClass = Class.forName(className);
        //暴力反射获取构造方法
        Constructor constructor = aClass.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);
        //创建对象
        Object o = constructor.newInstance();

        //暴力反射获取方法
        Method method = aClass.getDeclaredMethod(classMethod);
        //取消访问检查
        method.setAccessible(true);
        if (method.isAnnotationPresent(Test.class)) {
            method.invoke(o);
        }
        //运行方法
        method.invoke(o);
    }
}
