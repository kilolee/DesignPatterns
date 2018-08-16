package com.hand;

/**
 * Created by kilo on 2018/8/16.
 *
 * 表示猜拳游戏中"手势"的类
 */
public class Hand {
    public static final int HANDVALUE_GUU = 0;//石头
    public static final int HANDVALUE_CHO = 1;//剪刀
    public static final int HANDVALUE_PAA = 2;//布
    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };
    private static final String[] name = {"石头", "剪刀", "布"};//手势对应的字符串

    private int handValue;//手势的值

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    /**
     * 根据手势的值获取其对应的实例
     *
     * @param handValue
     * @return
     */
    public static Hand getInstance(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    /**
     * 记分：平0, 胜1, 负-1
     *
     * @param h
     * @return
     */
    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * 转换为手势值所对应的字符串
     *
     * @return
     */
    @Override
    public String toString() {
        return name[handValue];
    }
}
