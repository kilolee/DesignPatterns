package com.kilo.number;

/**
 * Created by kilo on 2018/8/23.
 * Observer的实现类
 * 以数字形式显示数值
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
