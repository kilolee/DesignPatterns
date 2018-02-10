/**
 * 具体的子类，提供了咖啡制备的具体实现
 * Created by knightly on 2018/2/10.
 */
public class Coffee extends RefreshBeverage {
    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }
}
