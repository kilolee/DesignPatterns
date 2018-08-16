package com.duck.children;

import com.duck.fly.impl.FlyWithNoWay;
import com.duck.parent.Duck;

/**
 * Created by kilo on 2018/3/10.
 */
public class RubberDuck extends Duck{
    public RubberDuck() {
        super();
        super.setFlyStrategy(new FlyWithNoWay());
    }

    @Override
    public void display() {
        System.out.println("我全是发黄，嘴巴很红");
    }

    /**
     * 重写quack方法
     */
    @Override
    public void quack() {
        System.out.println("嘎~嘎~嘎~");
    }
}
