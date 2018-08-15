package factory;

/**
 * Created by kilo on 2018/8/15.
 * 抽象地表示HTML的超链接的类
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }

}
