import com.duck.children.SpaceDuck;
import com.duck.parent.Duck;

/**
 * Created by kilo on 2018/3/10.
 */
public class DuckTest {

    public static void main(String[] args) {
        System.out.println("测试鸭子程序");
        System.out.println("**************************");

        Duck duck = null;
//        duck = new BigYellow();
//        duck = new RubberDuck();
//        duck = new GreenNeckDuck();
//        duck = new RedHeadDuck();
        duck = new SpaceDuck();

        duck.display();
        duck.quack();
        duck.fly();

        System.out.println("**************************");
        System.out.println("测试完毕");
    }

}
