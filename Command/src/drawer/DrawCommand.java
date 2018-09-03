package drawer;

import command.Command;

import java.awt.*;

/**
 * Created by kilo on 2018/9/3.
 * 表示"绘制一个点的命令"的类
 */
public class DrawCommand implements Command {
    //绘制对象
    protected Drawable drawable;
    //绘制位置
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    /**
     * 执行绘图
     */
    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
