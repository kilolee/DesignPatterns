/**
 * Created by kilo on 2018/8/23.
 * Mediator角色
 * 定义仲裁者的接口
 * 定义与Colleague角色进行通信和做出决定的接口
 */
public interface Mediator {
    void createColleagues();

    void colleagueChanged();
}
