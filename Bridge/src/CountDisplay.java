/**
 * Created by kilo on 2018/8/16.
 * 类的功能层次结构，扩展了Display的功能
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    /**
     * 扩展的新功能
     * 显示规定的次数
     *
     * @param times
     */
    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
