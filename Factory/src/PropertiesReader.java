import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * properties文件读取工具
 * Created by knightly on 2018/2/10.
 */
public class PropertiesReader {

    public Map<String,String> getProperties(){

        Properties properties = new Properties();
        Map<String,String> map = new HashMap<>();
        try {
            InputStream in = getClass().getResourceAsStream("type.properties");
            properties.load(in);
            Enumeration en = properties.propertyNames();
            while (en.hasMoreElements()){
                String key = (String) en.nextElement();
                String property = properties.getProperty(key);
                map.put(key,property);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }


}
