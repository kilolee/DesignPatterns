package com.kilo.weather;

import com.kilo.weather.observer.ConcreteWeatherObserver;
import com.kilo.weather.subject.ConcreteWeatherSubject;

/**
 * Created by kilo on 2018/3/10.
 */
public class Client {
    public static void main(String[] args) {
        //创建目标
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();

        //创建观察者
        ConcreteWeatherObserver observerGirl = new ConcreteWeatherObserver();
        observerGirl.setObserverName("女朋友");
        observerGirl.setRemindThing("公园见面");

        ConcreteWeatherObserver observerMum = new ConcreteWeatherObserver();
        observerMum.setObserverName("妈妈");
        observerMum.setRemindThing("逛街购物");

        //注册观察者
        weather.attach(observerGirl);
        weather.attach(observerMum);

        //目标发布天气情况
        weather.setWeatherContent("明天天气晴朗，气温28度");
    }
}
