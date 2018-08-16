/**
 * Created by kilo on 2018/8/16.
 * 类的功能层次结构
 */
public class Display {
    private DisplayImpl impl;//使用DispalyImpl的实现类，连接了类的功能层次结构和实现层次结构的桥梁

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    /**
     * 显示处理方法
     */
    public final void display() {
        open();
        print();
        close();
    }

}
