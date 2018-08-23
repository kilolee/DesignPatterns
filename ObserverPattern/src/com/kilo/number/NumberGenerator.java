package com.kilo.number;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kilo on 2018/8/23.
 * 表示生成数值的对象的抽象类
 */
public abstract class NumberGenerator {
    private List observers = new ArrayList();

    /**
     * 添加观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer
     */
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 向观察者发送通知
     */
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(this);
        }
    }

    /**
     * 获取数值
     *
     * @return
     */
    public abstract int getNumber();

    /**
     * 生成数值
     */
    public abstract void execute();
}
