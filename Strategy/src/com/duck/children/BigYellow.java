package com.duck.children;

import com.duck.parent.Duck;
import com.duck.fly.impl.FlyWithNoWay;

/**
 * Created by knightly on 2018/3/10.
 */
public class BigYellow extends Duck {
    public BigYellow() {
        super();
        super.setFlyStrategy(new FlyWithNoWay());
    }

    @Override
    public void display() {
        System.out.println("我身体很大，全身黄黄");
    }
}
