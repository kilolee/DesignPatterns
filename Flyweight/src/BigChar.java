import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by kilo on 2018/9/1.
 * 此类的实例被共享
 */
public class BigChar {
    //字符名称
    private char charname;
    //大型字符对应的字符串(由'#' '.' '\n'组成)
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("resources/big" + charname + ".txt"));
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
            }
            reader.close();
            fontdata = stringBuilder.toString();
        } catch (IOException e) {
            fontdata = charname + "?";
        }
    }

    /**
     * 显示大型字符
     */
    public void print() {
        System.out.println(fontdata);
    }
}
