package tablefactory;

import factory.Item;
import factory.Tray;

import java.util.Iterator;

/**
 * Created by kilo on 2018/8/15.
 */
public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<td>");
        stringBuilder.append("<table width=\"100%\" border=\"1\"><tr>");
        stringBuilder.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + tray.size() + "\"><b>" + caption + "</b></td>");
        stringBuilder.append("</tr>\n");
        stringBuilder.append("<tr>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            stringBuilder.append(item.makeHTML());
        }
        stringBuilder.append("</tr></table>");
        stringBuilder.append("</td>");
        return stringBuilder.toString();
    }
}
