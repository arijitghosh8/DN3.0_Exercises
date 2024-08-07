package com.library.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.library.service.BookService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Entering method: " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.library.service.BookService.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Exiting method: " + joinPoint.getSignature().getName());
    }
}
