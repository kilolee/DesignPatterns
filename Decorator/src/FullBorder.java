/**
 * Created by kilo on 2018/8/17.
 * <p>
 * 具体修饰类
 * 显示上下边框
 */
public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
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
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {//上边框
            return "+" + makeLine('-', display.getColums()) + "+";
        } else if (row == display.getRows() + 1) {//下边框
            return "+" + makeLine('-', display.getColums()) + "+";
        } else {//其他边框
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    /**
     * 生成一个重复count次字符ch的字符串
     *
     * @param ch
     * @param count
     * @return
     */
    private String makeLine(char ch, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
