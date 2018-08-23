import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * Created by kilo on 2018/8/23.
 * 表示文本输入框的类，实现了Colleague接口
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) throws HeadlessException {
        super(text, columns);
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
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    /**
     * 当文字发生变化时通知Mediator
     *
     * @param event
     */
    @Override
    public void textValueChanged(TextEvent event) {
        mediator.colleagueChanged();
    }
}
