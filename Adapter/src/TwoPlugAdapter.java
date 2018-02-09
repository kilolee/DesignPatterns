/**
 * 采用组合的方式,可称为对象适配器
 * 二相转三相的插座适配器
 * Created by knightly on 2018/2/9.
 */
public class TwoPlugAdapter implements ThreePlugIf {

    private GBTwoPlug plug;

    public TwoPlugAdapter(GBTwoPlug plug) {
        this.plug = plug;
    }

    @Override
    public void powerWithThree() {
        System.out.printf("通过转换");
        plug.powerWithTwo();
    }
}
