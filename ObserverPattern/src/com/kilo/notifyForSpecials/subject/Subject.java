package com.kilo.notifyForSpecials.subject;

import com.kilo.notifyForSpecials.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气目标类
 * Created by kilo on 2018/3/12.
 */
public abstract class Subject {

    //用来保存注册的观察者对象
    public List<Observer> observers = new ArrayList<Observer>();

    //添加订阅者
    public void attach(Observer observer){
        observers.add(observer);
    }

    //删除订阅者
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //定义通知方法
    protected abstract void notifyObservers();


}
