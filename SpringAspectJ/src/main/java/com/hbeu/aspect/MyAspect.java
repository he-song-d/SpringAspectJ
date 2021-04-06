package com.hbeu.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;


@Aspect
@Component
public class MyAspect {
    @Around("execution(* com.hbeu.service.imp.BankServiceImp.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        //执行原有方法
        Object proceed = joinPoint.proceed();
        List<Log> logList = (List<Log>) proceed;
        logList.stream().forEach(s -> System.out.println(s));
    }
}
