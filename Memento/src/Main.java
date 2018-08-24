import game.Gamer;
import game.Memento;

/**
 * Created by kilo on 2018/8/24.
 * 进行游戏的类
 * 事先保存Memento的实例，之后根据需要恢复Gamer的状态
 */
public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);//最初持有金钱数为100
        Memento memento = gamer.createMemento();//保存最初的状态
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("当前状态:" + gamer);
            gamer.bet();//进行游戏
            System.out.println("所持金钱为" + gamer.getMoney() + "元。");
            //决定如何处理Memento
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("（所持金钱增加了许多，因此保存游戏当前的状态）");
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("（所持金钱减少了许多，因此将游戏恢复至以前的状态）");
                gamer.restoreMemento(memento);
            }
            //等待一段时间
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }
}
