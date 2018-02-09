/**
 * 单例模式之一：饿汉模式
 * 加载类时比较慢，但运行时获取对象比较快
 * Created by knightly on 2018/2/9.
 */
public class HungerSingleton {
    //将构造方法私有化，不允许外部直接创建对象
    private HungerSingleton() {
    }

    private static HungerSingleton instance = new HungerSingleton();

    public static HungerSingleton getInstance() {
        return instance;
    }
}
