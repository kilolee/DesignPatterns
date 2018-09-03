/**
 * Created by kilo on 2018/9/3.
 * 语法解析中可能会发生异常
 */
public class ParseException extends Exception {
    public ParseException(String message) {
        super(message);
    }
}
