import java.awt.*;

/**
 * Created by kilo on 2018/8/23.
 * 表示按钮的类，实现Colleague接口
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption) throws HeadlessException {
        super(caption);
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
}
