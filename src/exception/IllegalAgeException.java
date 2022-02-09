package exception;

/**
 * 自定义异常
 * 通常使用自定义异常用来表达业务错误。
 *
 * 自定义异常应当做到以下几点:
 * 1:类名要见名知意。
 * 2:需要继承Exception(直接或间接继承均可)
 * 3:提供超类中所有的构造器
 *
 * Illegal:非法的
 */
public class IllegalAgeException extends Exception{
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
