package com.kilo.weather.observer;


import com.kilo.weather.subject.Subject;
import com.kilo.weather.subject.ConcreteWeatherSubject;

/**
 * 具体的观察者对象，实现更新方法，是自身的状态和目标的状态保持一致
 * Created by kilo on 2018/3/10.
 */
public class ConcreteWeatherObserver implements Observer {
    //订阅者的名字，是谁收到了讯息
    private String observerName;
    //订阅的内容，这个消息从目标处获取
    private String weatherContent;
    //提醒的内容
    private String remindThing;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }

    /**
     * 获取目标类的状态，同步观察者对象的状态
     *
     * @param subject 传入目标对象，方便获取相应的目标对象的状态
     */
    @Override
    public void update(Subject subject) {
        weatherContent = ((ConcreteWeatherSubject) subject).getWeatherContent();
        System.out.println(observerName + "收到了" + weatherContent + "," + remindThing);
    }
}
