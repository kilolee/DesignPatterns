import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kilo on 2018/8/23.
 * Mediator的实现类
 * 实现Mediator角色的接口，负责实际做出决定
 */
public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPwd;
    private ColleagueButton buttonOK;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        //使用布局管理器生成4*2窗格
        setLayout(new GridLayout(4, 2));
        //生成各个Colleague
        createColleagues();
        //配置
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPwd);
        add(buttonOK);
        add(buttonCancel);
        //设置初始的启用/禁用状态
        colleagueChanged();
        //显示
        pack();
        show();
    }

    /**
     * 生成各个Colleague
     */
    @Override
    public void createColleagues() {
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);
        textUser = new ColleagueTextField("", 10);
        textPwd = new ColleagueTextField("", 10);
        textPwd.setEchoChar('*');
        buttonOK = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");
        //设置Mediator
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPwd.setMediator(this);
        buttonOK.setMediator(this);
        buttonCancel.setMediator(this);
        //设置Listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPwd.addTextListener(textPwd);
        buttonOK.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    /**
     * 接受来自于Colleague的通知，然后判断各Colleague的启用/禁用状态
     */
    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            textUser.setColleagueEnabled(false);
            textPwd.setColleagueEnabled(false);
            buttonOK.setColleagueEnabled(true);
        } else {
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    /**
     * 当textUser或textPwd文本输入框中的文字发生变化时
     * 判断各Colleague的启用/禁用状态
     */
    private void userpassChanged() {
        if (textUser.getText().length() > 0) {
            textPwd.setColleagueEnabled(true);
            if (textPwd.getText().length() > 0) {
                buttonOK.setColleagueEnabled(true);
            } else {
                buttonOK.setColleagueEnabled(false);
            }
        } else {
            textPwd.setColleagueEnabled(false);
            buttonOK.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
