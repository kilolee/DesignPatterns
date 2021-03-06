import framework.Manager;
import framework.Product;

/**
 * Created by kilo on 2018/8/14.
 */
public class Main {
    public static void main(String[] args) {
        //准备
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        //注册
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        //克隆
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
        System.out.println(upen != p1);//true
        System.out.println(upen.equals(p1));//false,该对象的equals方法没有重写，调用的是Object.equals()
        System.out.println(upen.getClass() == p1.getClass());//true
    }
}
