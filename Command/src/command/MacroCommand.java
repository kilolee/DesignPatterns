package command;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by kilo on 2018/9/3.
 * "由多个命令组合成的命令"的类
 */
public class MacroCommand implements Command {
    //命令集合
    private Stack commands = new Stack();

    @Override
    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            ((Command) it.next()).execute();
        }
    }

    /**
     * 添加命令
     *
     * @param cmd
     */
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    /**
     * 删除最后一条命令
     */
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    /**
     * 删除所有命令
     */
    public void clear() {
        commands.clear();
    }
}
