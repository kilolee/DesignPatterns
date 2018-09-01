package printer;

/**
 * Created by kilo on 2018/9/1.
 * 定义打印功能接口，使"本人"与"代理者"具有一致性
 */
public interface Printable {
    /**
     * 设置名字
     *
     * @param name
     */
    void setPrinterName(String name);

    /**
     * 获取名字
     *
     * @return
     */
    String getPrinterName();

    /**
     * 显示文字（打印输出）
     *
     * @param string
     */
    void print(String string);

}
