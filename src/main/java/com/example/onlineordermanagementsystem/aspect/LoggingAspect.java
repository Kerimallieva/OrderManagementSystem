package com.example.onlineordermanagementsystem.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {


    @Around("com.example.onlineordermanagementsystem.aspect.Pointcuts.aroundPointCut()")
    public Object logOrderPlacement(ProceedingJoinPoint joinPoint) throws  Throwable{

        System.out.println("⏳ Начало обработки заказа...");

        Object result = joinPoint.proceed();

        System.out.println("✅ Заказ обработан успешно!");
        return result;
    }

    @AfterReturning(pointcut = "com.example.onlineordermanagementsystem.aspect.Pointcuts.afterReturningPointcut()",
    returning = "order")
    public void logOrderRetrieval(Object order){
        System.out.println("📦 Заказ получен: " + order);
    }

    @AfterThrowing(pointcut = "com.example.onlineordermanagementsystem.aspect.Pointcuts.afterReturningPointcut()", throwing = "e")
    public void logOrderNotFound(Exception e){
        System.out.println("❌ Ошибка: " + e.getMessage());
    }
}
