package com.hand;

/**
 * Created by kilo on 2018/8/16.
 *
 * 策略接口
 */
public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}
