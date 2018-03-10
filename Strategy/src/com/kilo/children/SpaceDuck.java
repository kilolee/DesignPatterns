package com.kilo.children;

import com.kilo.fly.impl.FlyWithRocket;
import com.kilo.parent.Duck;

/**
 * Created by knightly on 2018/3/10.
 */
public class SpaceDuck extends Duck {
    public SpaceDuck() {
        super();
        super.setFlyStrategy(new FlyWithRocket());
    }

    @Override
    public void display() {
        System.out.println("我头戴宇航头盔");
    }

    /**
     * 重写quack方法
     */
    @Override
    public void quack() {
        System.out.println("我通过无线电与你通信");
    }
}
