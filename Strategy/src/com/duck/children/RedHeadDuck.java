package com.duck.children;

import com.duck.parent.Duck;
import com.duck.fly.impl.FlyWithWin;

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
