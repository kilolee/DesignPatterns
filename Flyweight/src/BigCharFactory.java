import java.util.HashMap;
import java.util.Map;

/**
 * Created by kilo on 2018/9/1.
 * 生成共享实例
 */
public class BigCharFactory {
    //保存已经生成的BigChar的实例
    private Map pool = new HashMap();
    private static BigCharFactory instance = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return instance;
    }

    /**
     * 生成（共享）BigChar类的实例
     *
     * @param charname
     * @return
     */
    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = (BigChar) pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
