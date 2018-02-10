import org.junit.Test;

/**
 * Created by knightly on 2018/2/10.
 */
public class RefreshBeverageTest {

    @Test
    public void testCoffee() {
        System.out.println("开始制备咖啡...");
        RefreshBeverage b1 = new Coffee();
        b1.prepareBeverageTemplate();
        System.out.println("咖啡好了!");
    }

    @Test
    public void testTea() {
        System.out.println("开始制备茶...");
        RefreshBeverage b2 = new Tea();
        b2.prepareBeverageTemplate();
        System.out.println("茶好了!");
    }
}
