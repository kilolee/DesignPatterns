package com.hand;

/**
 * Created by kilo on 2018/8/16.
 *
 * 使用策略猜拳的人
 */
public class Player {
    private String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    /**
     * 决策决定下一局要出的手势
     *
     * @return
     */
    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even() {
        gameCount++;
    }

    @Override
    public String toString() {
        return "[" + name + ":" + gameCount + " games, "
                + winCount + " win, " + loseCount + " lose" + "]";
    }
}
