/**
 * Created by kilo on 2018/8/15.
 * <p>
 * 使用Builder的接口来生成实例
 * Director并不知道使用的究竟是Builder的哪个子类，实现了组件的替换
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 编写文档
     * 使用的方法都是在Builder中声明的方法
     */
    public void construct() {
        builder.makeTitle("Greeting");              // 标题
        builder.makeString("从早上至下午");         // 字符串
        builder.makeItems(new String[]{             // 条目
                "早上好。",
                "下午好。",
        });
        builder.makeString("晚上");                 // 其他字符串
        builder.makeItems(new String[]{             // 其他条目
                "晚上好。",
                "晚安。",
                "再见。",
        });
        builder.close();                            // 完成文档
    }
}
