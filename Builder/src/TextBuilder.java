/**
 * Created by kilo on 2018/8/15.
 *
 * Builder的子类，实现方法的具体细节
 */
public class TextBuilder extends Builder {
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        stringBuilder.append("==========================\n");
        stringBuilder.append("『" + title + "』\n");
        stringBuilder.append("\n");
    }

    @Override
    public void makeString(String str) {
        stringBuilder.append('■' + str + "\n");
        stringBuilder.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            stringBuilder.append("　[]" + items[i] + "\n");
        }
        stringBuilder.append("\n");
    }

    @Override
    public void close() {
        stringBuilder.append("==========================\n");
    }

    /**
     * 完成的文档
     * 将StringBuilder转变为String
     *
     * @return
     */
    public String getResult() {
        return stringBuilder.toString();
    }
}
