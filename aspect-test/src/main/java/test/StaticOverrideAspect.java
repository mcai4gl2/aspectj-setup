package test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StaticOverrideAspect {
    @Pointcut("execution(public static * *(..))")
    public void staticMethodEntryPoint() {

    }

    @Before("staticMethodEntryPoint()")
    public void beforeHelloStaticMethodCalled(JoinPoint joinPoint) {
        System.out.println("Hello static method called");
    }

    @Around("staticMethodEntryPoint()")
    public void helloOverride(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Around hello");
        System.out.println(jp);
        jp.proceed();
    }
}
