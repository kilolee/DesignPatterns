/**
 * Created by kilo on 2018/9/3.
 * 表示语法树节点的类
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
