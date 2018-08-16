package com.duck.children;

import com.duck.fly.impl.FlyWithWin;
import com.duck.parent.Duck;

/**
 * Created by kilo on 2018/3/10.
 */
public class GreenNeckDuck extends Duck {
    public GreenNeckDuck() {
        super();
        super.setFlyStrategy(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是绿色的");
    }
}
