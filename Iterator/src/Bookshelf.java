/**
 * Created by kilo on 2018/8/14.
 * 书架，可添加书架中的书籍，遍历书架
 */
public class Bookshelf implements Aggreate {

    private Book[] books;
    private int last = 0;

    public Bookshelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }

    /**
     * 存书的数量
     *
     * @return
     */
    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookshelfIterator(this);
    }
}
