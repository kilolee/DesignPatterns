import java.util.Random;

/**
 * 实现开车
 * Created by knightly on 2018/2/12.
 */
public class Car implements Moveable {

    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
