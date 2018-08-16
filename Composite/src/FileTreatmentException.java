/**
 * Created by kilo on 2018/8/16.
 * <p>
 * 向文件中添加Entry时发生的异常的类
 */
public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {
    }

    public FileTreatmentException(String message) {
        super(message);
    }
}
