package com.duck.fly.impl;

import com.duck.fly.FlyStrategy;

/**
 * Created by kilo on 2018/3/10.
 */
public class FlyWithWin implements FlyStrategy {
    @Override
    public void performFly() {
        System.out.println("振翅高飞");
    }
}
