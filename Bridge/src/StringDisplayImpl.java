/**
 * Created by kilo on 2018/8/16.
 * 类的实现层次结构
 * 实现父类定义的接口
 */
public class StringDisplayImpl extends DisplayImpl {
    private String string;//要显示的字符串
    private int width;//以字节单位计算出的字符串的宽度

    public StringDisplayImpl(String string) {
        this.string = string;
        width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
