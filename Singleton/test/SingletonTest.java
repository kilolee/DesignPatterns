import org.junit.Test;

/**
 * Created by knightly on 2018/2/9.
 */
public class SingletonTest {

    @Test
    public void testHunger() {
        HungerSingleton singleton1 = HungerSingleton.getInstance();
        HungerSingleton singleton2 = HungerSingleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.printf("singleton1与singleton2是同一个实例");
        } else {
            System.out.printf("singleton1与singleton2不是同一个实例");
        }
    }

    @Test
    public void testLazy() {
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.printf("singleton1与singleton2是同一个实例");
        } else {
            System.out.printf("singleton1与singleton2不是同一个实例");
        }
    }
}
