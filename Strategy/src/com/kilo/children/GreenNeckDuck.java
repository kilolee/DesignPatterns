package com.kilo.children;

import com.kilo.fly.impl.FlyWithWin;
import com.kilo.parent.Duck;

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
