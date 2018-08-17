/**
 * Created by kilo on 2018/8/17.
 * <p>
 * 具体的被修饰的对象
 * 显示单行字符串
 */
public class StringDisplay extends Display {
    // 要显示的字符串
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColums() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;  // 行数是1
    }

    /**
     * 仅当row为0时返回字符串
     *
     * @param row
     * @return
     */
    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
