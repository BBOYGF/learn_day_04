package com.learn.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    //method:要执行的目标方法
    //objects:参数
    //targeet:目标对象
    public void before(Method method, Object[] objects, Object targeet) throws Throwable {
        System.out.println(targeet.getClass().getName()+"的"+method.getName()+"方法，被执行了！");
    }
}
