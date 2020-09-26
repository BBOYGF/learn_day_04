package com.learn.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Controller;

//方式三，使用注解方式实现AOP
//定义一个切面
@Controller
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.learn.server.ServiceImpl.*(..))")
    public void before()
    {
        System.out.println("注解方式实现！====之前");
    }
    @After("execution(* com.learn.server.ServiceImpl.*(..))")
    public void after()
    {
        System.out.println("注解方式实现！====之后");
    }
    //可以自定义执行逻辑 可以用里面的参数实现一些功能
    @Around("execution(* com.learn.server.ServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("注解方式实现！====环绕前");
        Object proceed=pj.proceed();
        System.out.println("类的信息是："+pj.getSignature());
        System.out.println("注解方式实现！====环绕后");
    }
}
