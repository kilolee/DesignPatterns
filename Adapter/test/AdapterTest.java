import org.junit.Test;

/**
 * Created by knightly on 2018/2/9.
 */
public class AdapterTest {

    /**
     * 使用组合适配器（对象适配器）
     */
    @Test
    public void testAdapter() {
        GBTwoPlug two = new GBTwoPlug();
        ThreePlugIf three = new TwoPlugAdapter(two);
        NoteBook noteBook = new NoteBook(three);
        noteBook.charge();
    }

    /**
     * 使用继承适配器（类适配器）
     */
    @Test
    public void testAdapterExtends() {
        ThreePlugIf three = new TwoPlugAdapterExtends();
        NoteBook noteBook = new NoteBook(three);
        noteBook.charge();
    }
}
