package factory;

/**
 * Created by kilo on 2018/8/15.
 * 抽象工厂类
 */
public abstract class Factory {

    private static Factory instance = null;

    /**
     * 根据指定的类名生成具体工厂的实例
     *
     * @param className
     * @return
     */
    public static Factory getFactory(String className) {
        try {
            instance = (Factory) Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("没有找到 " + className + "类。");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
