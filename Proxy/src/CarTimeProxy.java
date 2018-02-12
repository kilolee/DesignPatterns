/**
 * Created by knightly on 2018/2/12.
 */
public class CarTimeProxy implements Moveable {
    private Moveable m;

    public CarTimeProxy(Moveable m) {
        this.m = m;
    }

    @Override
    public void move() {
        Long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        m.move();
        Long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶...汽车行驶时间:" + (endTime - startTime) + "毫秒！");
    }
}
