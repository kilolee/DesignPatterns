package framework;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kilo on 2018/8/14.
 */
public class Manager {
    private Map showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    /**
     * 调用Product.createClone复制实例
     *
     * @param protoName
     * @return
     */
    public Product create(String protoName) {
        Product p = (Product) showcase.get(protoName);
        return p.createClone();
    }
}
