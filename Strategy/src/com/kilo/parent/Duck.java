package com.kilo.parent;

import com.kilo.fly.FlyStrategy;

/**
 * 超类，所有的鸭子都要继承此类
 * 抽象了鸭子的行为：显示和鸣叫
 * Created by kilo on 2018/3/10.
 */
public abstract class Duck {

    /**
     * 鸭子发出叫声
     * 通用行为，由超类实现
     */
    public void quack() {
        System.out.println("嘎嘎嘎");
    }

    /**
     * 显示鸭子的外观
     * 鸭子的外观各不相同，声明为abstract，由子类实现
     */
    public abstract void display();

    private FlyStrategy flyStrategy;

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void fly(){
        flyStrategy.performFly();
    }
}
