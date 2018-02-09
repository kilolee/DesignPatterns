/**
 * 单例模式之二：懒汉模式
 * 加载类时比较快，但运行时获取对象比较慢
 * Created by knightly on 2018/2/9.
 */
public class LazySingleton {
    private LazySingleton() {
    }

    private static LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
