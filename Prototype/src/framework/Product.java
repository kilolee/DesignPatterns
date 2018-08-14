package framework;

/**
 * Created by kilo on 2018/8/14.
 * 继承了java.lang.Cloneable接口，可以调用Object.clone()方法自动复制实例
 */
public interface Product extends Cloneable {
    void use(String s);

    /**
     * 调用clone方法自动复制实例
     *
     * @return
     */
    Product createClone();
}
