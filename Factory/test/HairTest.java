import org.junit.Test;

/**
 * Created by knightly on 2018/2/10.
 */
public class HairTest {

    @Test
    public void lefttest(){
        HairInterface left = new LeftHair();
        left.draw();
    }

    @Test
    public void className(){
        HairFactory factory = new HairFactory();
        HairInterface left = factory.getHairByClassName("LeftHair");
        left.draw();
    }

    @Test
    public void classkey(){
        HairFactory factory = new HairFactory();
        HairInterface left = factory.getHairByClassKey("left");
        left.draw();
    }
}
