/**
 * Created by kilo on 2018/8/24.
 * 表示管理金库状态，联系报警中心的接口
 */
public interface Context {
    /**
     * 设置时间
     *
     * @param hour
     */
    void setClock(int hour);

    /**
     * 改变状态
     *
     * @param state
     */
    void changeState(State state);

    /**
     * 联系报警中心
     *
     * @param msg
     */
    void callSecurityCenter(String msg);

    /**
     * 在报警中心留下记录
     *
     * @param msg
     */
    void recordLog(String msg);
}
