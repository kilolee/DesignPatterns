package com.hand;

import java.util.Random;

/**
 * Created by kilo on 2018/8/16.
 * 一个具体的策略
 * 根据上一局的手势，从概率上计算出下一局的手势
 */
public class ProStrategy implements Strategy {

    private Random random;
    private int preHandValue = 0;
    private int currentHandValue = 0;
    private int[][] history = {
            {1, 1, 1,},
            {1, 1, 1,},
            {1, 1, 1,}
    };

    public ProStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handValue;
        if (bet < history[currentHandValue][0]) {
            handValue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }
        preHandValue = currentHandValue;
        currentHandValue = handValue;
        return Hand.getInstance(handValue);
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[preHandValue][currentHandValue]++;
        } else {
            history[preHandValue][(currentHandValue + 1) % 3]++;
            history[preHandValue][(currentHandValue + 2) % 3]++;
        }
    }

    private int getSum(int hv) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[hv][i];
        }
        return sum;
    }
}
