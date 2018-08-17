import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kilo on 2018/8/17.
 *
 * Entry的一个实现类，代表文件夹
 */
public class Directory extends Entry {
    private String name;
    private List dir = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator iterator = dir.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            size += entry.getSize();
        }
        return size;
    }

    /**
     * 增加目录条目
     *
     * @param entry
     * @return
     */
    @Override
    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    /**
     * 生成Iterator
     *
     * @return
     */
    public Iterator iterator() {
        return dir.iterator();
    }

    /**
     * 接受访问者访问
     *
     * @param v
     */
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }


}
