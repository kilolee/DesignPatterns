import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by kilo on 2018/8/18.
 * 根据邮件地址编写改用户的Web页面
 */
public class PageMaker {

    private PageMaker() {
    }


    public static void makeWelcomePage(String mailAddr, String fileName) {

        try {
            Properties mailProp = Database.getProperties("G:\\workspace-for-IntelliJ\\DesignPatterns\\Facade\\resources\\mailData.properties");
            String username = mailProp.getProperty(mailAddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph("欢迎来到" + username + "的主页。");
            writer.paragraph("等着你的邮件哦！");
            writer.mailTo(mailAddr, username);
            writer.close();
            System.out.println(fileName + " is created for " + mailAddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
