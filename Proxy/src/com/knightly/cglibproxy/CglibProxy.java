package com.knightly.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by knightly on 2018/2/13.
 */
public class CglibProxy implements MethodInterceptor{
   private Enhancer enhancer = new Enhancer();

   public Object getProxy(Class clazz){
       //设置创建子类的类
       enhancer.setSuperclass(clazz);
       enhancer.setCallback(this);
       return enhancer.create();
   }

    /**
     * 拦截所有目标类方法的调用
     * @param obj 目标类的实例
     * @param method 目标方法的反射对象
     * @param args 方法的参数
     * @param methodProxy 代理类的实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("日志开始...");
        //代理类调用父类的方法
        methodProxy.invokeSuper(obj,args);
        System.out.println("日志结束...");
        return null;
    }
}
