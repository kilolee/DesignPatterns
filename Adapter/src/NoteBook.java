/**
 * 笔记本电脑
 * Created by knightly on 2018/2/9.
 */
public class NoteBook {
    private ThreePlugIf plug;

    public NoteBook(ThreePlugIf plug) {
        this.plug = plug;
    }

    //使用插座供电
    public void charge() {
        plug.powerWithThree();
    }


}
