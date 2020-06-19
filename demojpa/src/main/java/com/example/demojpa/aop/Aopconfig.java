package com.example.demojpa.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

/*
  aop日志
 */
@Aspect
@Component
public class Aopconfig {

        //TODO

    private Logger logger = Logger.getLogger(getClass());

    /*
    开始时间
     */

    ThreadLocal<Long> startTime = new ThreadLocal<>();

    /*?
            切点
     */
    @Pointcut("execution(public * com.example.demojpa.service.*.*(..))")
    public void webLog(){}
    @Before("webLog()")


    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());
            logger.info("初始化日志"+Aopconfig.class);
        // 省略日志记录内容
    }
    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("RESPONSE : " + ret);
        logger.info("SPEND TIME : " + (System.currentTimeMillis() - startTime.get()));
    }

    @After("webLog()")
    public void afterAdvice(){
        System.out.println("Student profile has been setup."+"初始日志LOGEEER");
        logger.info("RESPONSE : "+"------------------");
        logger.info("SPEND TIME : " + (System.currentTimeMillis() - startTime.get()));
    }

    @AfterThrowing(pointcut = "webLog()", throwing = "ex")
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
        logger.info("RESPONSE : " + ex);
        logger.info("SPEND TIME : " + (System.currentTimeMillis() - startTime.get()));
    }
}
