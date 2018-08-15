package listfactory;

import factory.Item;
import factory.Tray;

import java.util.Iterator;

/**
 * Created by kilo on 2018/8/15.
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<li>\n");
        stringBuilder.append(caption + "\n");
        stringBuilder.append("<ul>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            stringBuilder.append(item.makeHTML());
        }
        stringBuilder.append("</ul>\n");
        stringBuilder.append("</li>\n");
        return stringBuilder.toString();
    }
}
