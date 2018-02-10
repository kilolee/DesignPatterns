/**
 * 抽象基类，为所有子类提供一个算法框架
 * 提神饮料
 * Created by knightly on 2018/2/10.
 */
public abstract class RefreshBeverage {

    /**
     * 制备饮料的模板方法
     * 封装了所有子类共同遵循的算法框架
     */
    public final void prepareBeverageTemplate() {
        //将水煮沸
        boilWater();
        //泡制饮料
        brew();
        //将饮料倒入杯中
        pourInCup();
        if (isCustomerWantsCondiments()) {
            //加入调味料
            addCondiments();
        }
    }


    /**
     * 基本方法：将水煮沸
     */
    private void boilWater() {
        System.out.println("将水煮沸");
    }

    /**
     * 抽象的基本方法：泡制饮料
     */
    protected abstract void brew();

    /**
     * 基本方法：将饮料倒入杯中
     */
    private void pourInCup() {
        System.out.println("将饮料倒入杯中");
    }

    /**
     * 抽象的基本方法：加入调味料
     */
    protected abstract void addCondiments();

    /**
     * Hook(钩子函数)，提供一个默认或空的实现
     * 具体的子类可以自行决定是否挂钩以及如何挂钩
     * 这里询问用户师傅偶加入调料
     */
    protected boolean isCustomerWantsCondiments() {
        return true;
    }
}
