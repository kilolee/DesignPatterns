/**
 * Created by kilo on 2018/8/14.
 * 书架迭代器
 */
public class BookshelfIterator implements Iterator {

    private Bookshelf bookshelf;
    private int index;

    public BookshelfIterator(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
        this.index = 0;
    }

    /**
     * 确认接下来是否可以调用next方法
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        if (index < bookshelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 返回当前的元素，并指向下一个元素
     *
     * @return
     */
    @Override
    public Object next() {
        Book book = bookshelf.getBookAt(index);
        index++;
        return book;
    }
}
