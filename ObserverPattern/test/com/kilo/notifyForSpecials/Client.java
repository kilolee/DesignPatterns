package com.kilo.notifyForSpecials;

import com.kilo.notifyForSpecials.observer.ConcreteWeatherObserver;
import com.kilo.notifyForSpecials.subject.ConcreteWeatherSubject;

/**
 * Created by kilo on 2018/3/12.
 */
public class Client {
    public static void main(String[] args) {
        //创建目标
        ConcreteWeatherSubject weatherSubject = new ConcreteWeatherSubject();

        //创建观察者
        ConcreteWeatherObserver observerGirl = new ConcreteWeatherObserver();
        observerGirl.setObserverName("女朋友");
        observerGirl.setRemindThing("下雨了，安静的呆在家里吧");

        ConcreteWeatherObserver observerMum = new ConcreteWeatherObserver();
        observerMum.setObserverName("妈妈");
        observerMum.setRemindThing("不管下雨还是下雪，我都不出门了");

        //注册观察者
        weatherSubject.attach(observerGirl);
        weatherSubject.attach(observerMum);

        //发布天气
        weatherSubject.setWeatherContent("下雨");
    }
}
