/**
 * Created by kilo on 2018/8/17.
 * <p>
 * 具体修饰类
 * 显示左右边框
 */
public class SideBorder extends Border {
    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    /**
     * 字符数为被修饰字符串两侧加边框后的字符数
     *
     * @return
     */
    @Override
    public int getColums() {
        return 1 + display.getColums() + 1;
    }

    /**
     * 行数为被修饰字符串的行数加上上下边框后的行数
     *
     * @return
     */
    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
