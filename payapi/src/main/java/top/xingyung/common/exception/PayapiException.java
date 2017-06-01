package top.xingyung.common.exception;

/**
 * Created by xy on 2017/6/1.
 */
public class PayapiException extends Exception{

    public PayapiException() {
    }

    public PayapiException(String message) {
        super(message);
    }

    public PayapiException(String message, Throwable cause) {
        super(message, cause);
    }

    public PayapiException(Throwable cause) {
        super(cause);
    }

    public PayapiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
