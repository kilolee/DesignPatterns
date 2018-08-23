import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by kilo on 2018/8/23.
 * 表示勾选框的类，实现了Colleague接口
 */
public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;

    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) throws HeadlessException {
        super(caption, group, state);
    }

    /**
     * 保存Mediator
     *
     * @param mediator
     */
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * Mediator下达启用/禁用的指示
     *
     * @param enabled
     */
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    /**
     * 当状态发生变化时通知Mediator
     *
     * @param e
     */
    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
