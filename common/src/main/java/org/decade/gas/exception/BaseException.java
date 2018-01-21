package org.decade.gas.exception;

import lombok.Getter;
import org.decade.gas.enums.BaseEnum;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 17-12-28
 */
public class BaseException extends RuntimeException {

    @Getter
    private int code;

    public BaseException(BaseEnum en) {
        super(en.getMsg());
        this.code = en.getCode();
    }

    public BaseException(int code, String msg) {
        super(msg);
        this.code = code;
    }


}
