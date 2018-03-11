package com.kilo.weather.subject;

import com.kilo.weather.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，他知道观察它的观察者，并提供注册（添加）和删除观察者的接口
 * Created by kilo on 2018/3/10.
 */
public class Subject {
    //保存注册的订阅天气的人
    private List<Observer> observers = new ArrayList<>();

    /**
     * 注册（添加）订阅天气的人
     *
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除集合中的指定订阅天气的人
     *
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有已经订阅了天气的人
     */
    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }


}
