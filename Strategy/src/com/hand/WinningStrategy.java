package com.hand;

import java.util.Random;

/**
 * Created by kilo on 2018/8/16.
 * 一个具体的策略
 * 如果本局获胜，下一局出一样的手势
 */
public class WinningStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private Hand preHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            preHand = Hand.getInstance(random.nextInt(3));
        }
        return preHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
