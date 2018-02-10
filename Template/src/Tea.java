/**
 * 具体的子类，提供了制备茶的具体实现
 * Created by knightly on 2018/2/10.
 */
public class Tea extends RefreshBeverage {
    @Override
    protected void brew() {
        System.out.println("用80度的热水浸泡茶叶5分钟");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    @Override
    protected boolean isCustomerWantsCondiments() {
        return false;
    }
}
