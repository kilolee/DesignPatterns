/**
 * Created by kilo on 2018/8/24.
 * 表示"晚上"状态的类，实现了State接口
 */
public class NightState implements State {

    private static NightState instance = new NightState();

    private NightState() {
    }

    public static NightState getInstance() {
        return instance;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急：晚上使用金库！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（晚上）");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("晚上的通话录音");
    }

    @Override
    public String toString() {
        return "[晚上]";
    }
}
