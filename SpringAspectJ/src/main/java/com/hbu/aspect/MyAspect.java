package com.hbu.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;


@Aspect
@Component
public class MyAspect {



    @Around("execution(* com.hbu.service.imp.BankServiceImp.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        //执行原有方法
        try {
            Object proceed = joinPoint.proceed();
            List<Log> logList= (List<Log>)proceed;
            logList.stream().forEach(s -> System.out.println(s));
        }catch (Exception e){
            System.out.println("没有该用户！");
        }
    }
}
