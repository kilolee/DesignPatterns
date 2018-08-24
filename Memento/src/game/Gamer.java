package game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by kilo on 2018/8/24.
 * 表示游戏主人公的类，它会生成Memento的实例
 * 负责生成Memento角色、使用接收到的Memento角色恢复自己的状态
 */
public class Gamer {
    private int money;
    private List fruits = new ArrayList();
    private Random random = new Random();
    private static String[] fruitsname = {"苹果", "葡萄", "香蕉", "橘子"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    /**
     * 随机返回"好吃的xxx"
     *
     * @return
     */
    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }

    /**
     * 投掷骰子进行游戏
     */
    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("所持金钱增加了。");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("所持金钱减半了。");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得了水果(" + f + ")。");
            fruits.add(f);
        } else {
            System.out.println("什么都没有发生。");
        }
    }

    /**
     * 创建快照
     */
    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String f = (String) it.next();
            if (f.startsWith("好吃的")) {
                m.addFruit(f);
            }
        }
        return m;
    }

    /**
     * 撤销
     *
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    /**
     * 用字符串表示主人公状态
     *
     * @return
     */
    @Override
    public String toString() {
        return '[' +
                "money=" + money +
                ", fruits=" + fruits +
                ", random=" + random +
                ']';
    }

}
