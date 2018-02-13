package com.knightly.dynamicproxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by knightly on 2018/2/13.
 */
public class Client {
    /**
     * JDK动态代理
     */
    @Test
    public void dynamicProxy() {
        Car car = new Car();
        Class cls = car.getClass();
        InvocationHandler h = new TimeHandler(car);
        /**
         * loader 类加载器
         * interface 实现接口
         * h InvocationHandler
         */
        Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
        m.move();
    }
}
