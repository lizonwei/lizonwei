package com.itheima.main;

import com.itheima.bean.MyZhuJie;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author ：lizonwei
 * @Date ：Created in 2020/11/9
 * @description ：
 * @version: 1.0
 */
@MyZhuJie(className = "com.itheima.bean.Dog", classMethod = "lookHome")
public class Main03 {
    public static void main(String[] args) throws Exception{
        //通过本类的字节码对象 获取注解对象
        MyZhuJie myZhuJie = Main03.class.getAnnotation(MyZhuJie.class);
        //获取注解内容
        String className = myZhuJie.className();
        String classMethod = myZhuJie.classMethod();

        //暴力反射创建上方的类对象
        Class aClass = Class.forName(className);
        //获取构造方法
        Constructor constructor = aClass.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);
        //创建对象
        Object o = constructor.newInstance();

        //暴力反射获取指定方法 并运行
        Method method = aClass.getDeclaredMethod(classMethod);
        //取消访问检查
        method.setAccessible(true);
        method.invoke(o);
    }
}
