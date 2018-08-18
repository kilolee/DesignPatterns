import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by kilo on 2018/8/18.
 * 从邮件地址中获取用户名的类
 */
public class Database {
    private Database() {
    }

    /**
     * 根据数据库名获取Properties
     *
     * @param dbName
     * @return
     */
    public static Properties getProperties(String dbName) {
        String fileName = dbName;
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(fileName));
        } catch (IOException e) {
            System.out.println("Warning: " + fileName + " is not found.");
        }
        return properties;
    }
}
