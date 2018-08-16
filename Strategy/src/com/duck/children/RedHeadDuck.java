package com.duck.children;

import com.duck.fly.impl.FlyWithWin;
import com.duck.parent.Duck;

/**
 * Created by kilo on 2018/3/10.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super();
        super.setFlyStrategy(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色的");
    }
}
