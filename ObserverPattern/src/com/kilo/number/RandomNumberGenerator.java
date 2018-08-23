package com.kilo.number;

import java.util.Random;

/**
 * Created by kilo on 2018/8/23.
 * 生成随机数的类
 */
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
