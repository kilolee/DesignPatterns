import java.util.Iterator;

/**
 * Created by kilo on 2018/8/17.
 */
public abstract class Entry implements Element {
    public abstract String getName();

    public abstract int getSize();

    /**
     * 增加目录条目
     *
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    /**
     * 生成Iterator
     *
     * @return
     * @throws FileTreatmentException
     */
    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
