import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by kilo on 2018/8/15.
 *
 * Builder的子类，实现方法的具体细节
 */
public class HTMLBuilder extends Builder {
    private String fileName;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        fileName = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");                                                     // 用<ul>和<li>输出
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");                                           // 关闭标签
        writer.close();
    }

    /**
     * 编写完成的文档
     * 返回文件名
     *
     * @return
     */
    public String getResult() {
        return fileName;
    }
}
