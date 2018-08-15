package factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kilo on 2018/8/15.
 * 抽象地表示一个包含有多个Link类和Tray类的容器
 */
public abstract class Tray extends Item {
    protected List tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
