/**
 * Created by kilo on 2018/8/15.
 *
 * 定义用于生成实例的API，
 */
public abstract class Builder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();
}
