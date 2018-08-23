/**
 * Created by kilo on 2018/8/23.
 * 定义Colleague角色的接口
 * 定义组员的接口
 * 负责定义与Mediator角色进行通信的接口
 */
public interface Colleague {
    void setMediator(Mediator mediator);

    void setColleagueEnabled(boolean enabled);
}
