package cf.vtool.projectv.exception;

import lombok.Getter;
import lombok.Setter;

public class BusinessException extends RuntimeException{

    @Getter
    @Setter
    private int code;

    public BusinessException( int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException( int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
