package hello.springmvc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Imaspear on 2022-01-17
 * Blog : https://imspear.tistory.com/
 * Github : https://github.com/Imaspear
 */

@Aspect
public class TimeTraceAop {
    //    패키지에 모두 적용
    @Around("execution(* hello.springmvc..*(..)) && !target(hello.springmvc.SpringConfig)")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
        long start = System.currentTimeMillis();
        System.out.println("START: " + joinPoint.toString());
        try {
            return joinPoint.proceed();
        }finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("END: " + joinPoint.toString()+ " " + timeMs + "ms");
        }
    }
}
