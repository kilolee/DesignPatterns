package printer;

/**
 * Created by kilo on 2018/9/1.
 * Printer的代理类
 */
public class PrinterProxy implements Printable {
    private String name;
    private Printer real;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null){
            real.setPrinterName(name);
        }
        this.name=name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    /**
     * 生成"本人"
     */
    private synchronized void realize(){
        if (real == null){
            real = new Printer(name);
        }
    }
}
