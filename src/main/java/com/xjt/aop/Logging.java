package com.xjt.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

/**
 * 常用通知场景
 *
 * 1 环绕通知: 控制事务 权限控制
 *
 * 2 后置通知: 记录日志(方法已经成功调用)
 *
 * 3 异常通知: 异常处理 控制事务
 *
 * 4 最终通知: 记录日志(方法已经调用，但不一定成功)
 *
 */
@Aspect
public class Logging {

    //定义一个切点
    @Pointcut(value = "execution(* com.xjt.aop.*.*(..))")
    private void selectAll(){};

    @Before(value = "selectAll()")
    public void beforeAdvice(JoinPoint jp) { // 可以选择额外的传入一个JoinPoint连接点对象，必须用方法的第一个参数接收。
        Class clz = jp.getTarget().getClass();
        Signature signature = jp.getSignature(); // 通过JoinPoint对象获取更多信息
        String name = signature.getName();
        System.out.println(" -- before...[" + clz + "]...[" + name + "]...");
    }

    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */
    @After(value = "selectAll()")
    public void afterAdvice(JoinPoint jp) { //在后置通知中也可以选择性的接收一个JoinPoint来获取连接点的额外信息，但是这个参数必须处在参数列表的第一个。
        Class clz = jp.getTarget().getClass();
        String name = jp.getSignature().getName();
        System.out.println(" -- after..["+clz+"]..["+name+"]...");
    }

    /**
     * This is the method which I would like to execute
     * when any method returns.
     */
    @AfterReturning(value = "selectAll()",returning = "msg")
    public void afterReturningAdvice(JoinPoint jp, Object msg) {
        Class clz = jp.getTarget().getClass();
        Signature signature = jp.getSignature();
        String name = signature.getName();
        System.out.println(" -- afterReturn...[" + clz + "]...[" + name + "]...");
    }

    /**
     * This is the method which I would like to execute
     * if there is an exception raised.
     */
    @AfterThrowing(value = "selectAll()",throwing = "ex")
    public void AfterThrowingAdvice(JoinPoint jp,Exception ex) {
        Class clz = jp.getTarget().getClass();
        String name = jp.getSignature().getName();
        System.out.println("afterThrow..["+clz+"]..["+name+"].."+ex.getMessage());
    }

    @Around(value = "selectAll()")
    public Object around(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("-- around before...");
        Object obj = jp.proceed(); //--显式的调用目标方法
        System.out.println("-- around after...");
        return obj;
    }


}
