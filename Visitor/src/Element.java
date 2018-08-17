/**
 * Created by kilo on 2018/8/17.
 * 表示数据结构的接口，接受访问者的访问
 */
public interface Element {
    void accept(Visitor v);
}
