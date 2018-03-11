package com.kilo.fromJava.subject;

import java.util.Observable;
import java.util.Observer;

/**
 * 天气目标的具体实现类
 * Created by kilo on 2018/3/11.
 */
public class ConcreteWeatherSubject extends Observable {
    //天气情况的内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //使用Java的Observer模式时，必不可少，用于更精确的触发控制
        this.setChanged();
        //进行通知，推的方式
        this.notifyObservers(content);
        //拉的方式，subject直接传递给观察者
//        this.notifyObservers();
    }
}
