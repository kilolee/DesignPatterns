/**
 * Created by kilo on 2018/8/16.
 * <p>
 * 用来实现File类和Directory类的一致性
 */
public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    /**
     * 加入目录条目
     *
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
