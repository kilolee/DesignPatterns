/**
 * Created by kilo on 2018/8/17.
 *
 * 修饰边框的抽象类
 */
public abstract class Border extends Display {
    protected Display display;//表示被装饰物

    protected Border(Display display) {
        this.display = display;
    }
}
