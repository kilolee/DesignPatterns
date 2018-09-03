package drawer;

import command.MacroCommand;

import java.awt.*;

/**
 * Created by kilo on 2018/9/3.
 * 实现"绘制对象"的类
 */
public class DrawCanvas extends Canvas implements Drawable {
    //颜色
    private Color color = Color.red;
    //绘制的圆点的半径
    private int raduis = 6;
    //命令的历史记录
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    /**
     * 重新全部绘制
     *
     * @param g
     */
    public void paint(Graphics g) {
        history.execute();
    }

    /**
     * 绘制
     *
     * @param x
     * @param y
     */
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - raduis, y - raduis, raduis * 2, raduis * 2);
    }
}
