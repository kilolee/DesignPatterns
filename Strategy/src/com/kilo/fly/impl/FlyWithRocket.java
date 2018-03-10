package com.kilo.fly.impl;

import com.kilo.fly.FlyStrategy;

/**
 * Created by kilo on 2018/3/10.
 */
public class FlyWithRocket implements FlyStrategy {
    @Override
    public void performFly() {
        System.out.println("用火箭在太空遨游");
    }
}
