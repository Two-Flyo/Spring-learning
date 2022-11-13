package com.lrf.advices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Date;

//自定义环绕通知用来记录目标方法的执行时长
public class MethodInvokeTimeAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("==============进入环绕通知==============");
        System.out.println("当前执行方法"+methodInvocation.getMethod().getName());
        System.out.println("方法参数:"+methodInvocation.getArguments()[0]);
        System.out.println("当前目标对象:"+methodInvocation.getThis());
        long start = new Date().getTime();
        //放行目标方法

        Object proceed = methodInvocation.proceed();//放行目标方法(继续处理)
        long end = new Date().getTime();
        System.out.println(methodInvocation.getMethod().getName()+"方法执行时长"+(end-start));
        return null;
    }
}
