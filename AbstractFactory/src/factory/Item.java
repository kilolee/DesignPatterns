package factory;

/**
 * Created by kilo on 2018/8/15.
 * 表示抽象的零件的类
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
