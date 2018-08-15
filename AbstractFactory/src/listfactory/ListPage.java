package listfactory;

import factory.Item;
import factory.Page;

import java.util.Iterator;

/**
 * Created by kilo on 2018/8/15.
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html><head><title>" + title + "</title></head>\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("<h1>" + title + "</h1>\n");
        stringBuilder.append("<ul>\n");
        Iterator iterator = content.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            stringBuilder.append(item.makeHTML());
        }
        stringBuilder.append("</ul>\n");
        stringBuilder.append("<hr><address>" + author + "</address>");
        stringBuilder.append("</body></html>\n");
        return stringBuilder.toString();
    }
}
