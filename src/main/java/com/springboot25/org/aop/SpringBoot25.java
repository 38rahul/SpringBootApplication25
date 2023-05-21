package com.springboot25.org.aop;

import org.aspectj.apache.bcel.classfile.ConstantNameAndType;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

@Aspect
@Component
public class SpringBoot25 {

    @Before(value = "execution(*  com.springboot25.org.controller.EmployeeController.*(..))")  // point cut expression
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Request to " + joinPoint.getSignature() + "," + Arrays.toString(joinPoint.getArgs()) + "Started at " + new Date());
    }
        // @Pointcut("execution(* com.springboot25.org.controller.EmployeeController.*(..))")
        // public void myPointcut() {}

//    @Before("myPointcut()")
//    public void beforeAdvice() {
//        // Code to be executed before the join point
//        System.out.println("Before advice executed");
//        ConstantNameAndType joinPoint = null;
//        System.out.println("Request to"+joinPoint.getSignature()+"Started at "+ new Date());
//    }

        @After(value = "execution(*  com.springboot25.org.controller.EmployeeController.*(..))")  // point cut expression
        public void afterAdvice(JoinPoint joinPoint) {
            System.out.println("Request to " + joinPoint.getSignature()+","+ Arrays.toString(joinPoint.getArgs()) + "Ended at " + new Date());

        }

    @Before(value = "execution(*  com.springboot25.org.service.EmployeeService.*(..))")  // point cut expression
    public void beforeAdviceForServiceLayer(JoinPoint joinPoint) {
        System.out.println("Request to  Service Layer " + joinPoint.getSignature() + "," + Arrays.toString(joinPoint.getArgs()) + "Started at " + new Date());
    }
    @After(value = "execution(*  com.springboot25.org.service.EmployeeService.*(..))")  // point cut expression
    public void afterAdviceForServiceLayer(JoinPoint joinPoint) {
        System.out.println("Request to Service Layer " + joinPoint.getSignature()+","+ Arrays.toString(joinPoint.getArgs()) + "Ended at " + new Date());

    }
}

