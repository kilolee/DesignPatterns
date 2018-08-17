/**
 * Created by kilo on 2018/8/17.
 *
 * 被修饰主体的抽象类
 */
public abstract class Display {
    public abstract int getColums();

    public abstract int getRows();

    public abstract String getRowText(int row);

    public void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
