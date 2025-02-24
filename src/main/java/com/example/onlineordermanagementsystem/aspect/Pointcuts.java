package com.example.onlineordermanagementsystem.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Pointcuts {
    @Pointcut("execution(* com.example.onlineordermanagementsystem.service.OrderService.placeOrder(..))")
    public void aroundPointCut(){}


    @Pointcut("execution(* com.example.onlineordermanagementsystem.service.OrderService.getOrderById(..))")
    public void afterReturningPointcut(){}



}
