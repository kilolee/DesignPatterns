import framework.Product;

/**
 * Created by kilo on 2018/8/14.
 */
public class MessageBox implements Product {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }

    /**
     * 调用Object.clone()方法自动复制实例
     *
     * @return
     */
    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

    /**
     * 重写clone方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }
}
