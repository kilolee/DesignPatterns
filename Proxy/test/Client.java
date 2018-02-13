import com.knightly.staticproxy.Car;
import com.knightly.staticproxy.CarLogProxy;
import com.knightly.staticproxy.CarTimeProxy;
import org.junit.Test;

/**
 * Created by knightly on 2018/2/12.
 */
public class Client {
    @Test
    public void staticProxy(){
        Car car = new Car();
        CarLogProxy clp = new CarLogProxy(car);
        CarTimeProxy ctp = new CarTimeProxy(clp);
        ctp.move();
    }
}
