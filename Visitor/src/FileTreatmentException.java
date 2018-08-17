/**
 * Created by kilo on 2018/8/17.
 * <p>
 * 向文件中add时发生异常的类
 */
public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {
    }

    public FileTreatmentException(String message) {
        super(message);
    }
}
