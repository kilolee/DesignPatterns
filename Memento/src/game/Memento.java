package game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kilo on 2018/8/24.
 * 表示Gamer状态的类
 * 记录当时money和fruit的数量
 */
public class Memento {
    int money;
    ArrayList fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    public int getMoney() {
        return money;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List getFruits() {
        return (List) fruits.clone();
    }


}
