/**
 * Created by kilo on 2018/8/17.
 * 表示访问者的抽象类，可以访问文件和文件夹
 * 对被访问对象(文件、文件夹)的处理都集中在访问者(visitor)中
 */
public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
