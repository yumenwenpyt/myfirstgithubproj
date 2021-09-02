package utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component("log")
@Aspect

public class logger {
    @Pointcut("execution(* service.impl.*.*(..))")
    private void pt1(){

    }
    @Before("pt1()")
    public void beforePrintLog() {
        System.out.println("前置通知");
    }
    @AfterReturning("pt1()")
    public void afterReturningPrintLog() {
        System.out.println("后置通知");
    }
    @AfterThrowing("pt1()")
    public void afterThrowingPrintLog() {
        System.out.println("异常通知");
    }
    @After("pt1()")
    public void afterPrintLog() {
        System.out.println("最终通知");
    }
    //@Around("pt1()")
    public void aroundPrintLog(ProceedingJoinPoint pjp) {
        Object obj;

        Object args = pjp.getArgs();
        try {
            System.out.println("前置通知");
            obj = pjp.proceed((Object[]) args);
            System.out.println("后置通知");
        } catch (Throwable throwable) {
            System.out.println("异常通知");
            throwable.printStackTrace();
        } finally {
            System.out.println("最终通知");
        }
    }
}
