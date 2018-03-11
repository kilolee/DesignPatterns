package com.kilo.fromJava;

import com.kilo.fromJava.observer.ConcreteWeatherObserver;
import com.kilo.fromJava.subject.ConcreteWeatherSubject;

/**
 * 测试类
 * Created by kilo on 2018/3/11.
 */
public class Client {
    public static void main(String[] args) {
        //创建天气作为目标
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();

        //创建观察者一
        ConcreteWeatherObserver girl = new ConcreteWeatherObserver();
        girl.setObserverName("女朋友");
        //创建观察者二
        ConcreteWeatherObserver mum = new ConcreteWeatherObserver();
        mum.setObserverName("妈妈");

        //注册观察者
        subject.addObserver(girl);
        subject.addObserver(mum);

        //目标更新天气情况
        subject.setContent("天气晴，气温28度");
    }
}
