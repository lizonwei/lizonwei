package com.itheima.main;

import com.itheima.bean.MyZhuJie;
import com.sun.xml.internal.ws.api.model.MEP;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @Author ：lizonwei
 * @Date ：Created in 2020/11/9
 * @description ：
 * @version: 1.0
 */
public class Main02 {
    public static void main(String[] args) throws Exception {
        //反射获取类对象
        Class aClass = Class.forName("com.itheima.bean.Pet");
        //直接创建空参对象
        Object o = aClass.newInstance();

        //反射获取所有方法 并 运行(有带自定义注解的方法才运行)
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            //取消检查
            method.setAccessible(true);
            if (method.isAnnotationPresent(MyZhuJie.class)) {
                method.invoke(o);
            }
        }
    }
}
