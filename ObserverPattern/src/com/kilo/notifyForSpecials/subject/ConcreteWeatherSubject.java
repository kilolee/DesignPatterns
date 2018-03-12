package com.kilo.notifyForSpecials.subject;

import com.kilo.notifyForSpecials.observer.Observer;

/**
 * Created by kilo on 2018/3/12.
 */
public class ConcreteWeatherSubject extends Subject{

    //晴天  下雨  下雪
    //目标对象的状态
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.notifyObservers();
    }

    @Override
    protected void notifyObservers() {
        //循环所有注册的观察者
        for (Observer observer:observers) {
            //规则：
            //女朋友：“下雨”通知，其他条件不通知
            //妈妈：“下雨”，“下雪”通知，其他条件不通知

            if ("下雨".equals(this.getWeatherContent())){
                if ("女朋友".equals(observer.getObserverName())){
                    observer.update(this);
                }
                if ("妈妈".equals(observer.getObserverName())){
                    observer.update(this);
                }
            }

            if ("下雪".equals(this.getWeatherContent())){
                if ("妈妈".equals(observer.getObserverName())){
                    observer.update(this);
                }
            }


        }
    }
}
