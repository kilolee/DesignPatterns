package com.kilo.notifyForSpecials.observer;

import com.kilo.notifyForSpecials.subject.Subject;

/**
 * 定义一个更新方法给目标发生改变时被被通知的观察者对象调用
 * Created by kilo on 2018/3/12.
 */
public interface Observer {

    //更新接口
    void update(Subject subject);

    //设置观察者名称
    void setObserverName(String observerName);

    //取得观察者名称
    String getObserverName();

}
