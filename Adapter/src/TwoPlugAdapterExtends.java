/**
 * 采用继承的方式,可称为类适配器
 * 二相转三相的插座适配器
 * Created by knightly on 2018/2/9.
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {
    @Override
    public void powerWithThree() {
        System.out.printf("借助继承适配器");
        this.powerWithTwo();
    }
}
