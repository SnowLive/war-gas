package org.decade.gas.exception;

import org.decade.gas.enums.PowersEnum;

/**
 * Class For:
 *  行政职权异常.
 * @auther: decade
 * @date: 18-1-6
 */

public class PowersException extends BaseException {

    public PowersException(PowersEnum en) {
        super(en.getCode(), en.getMsg());
    }


    public PowersException(int code, String msg) {
        super(code, msg);
    }
}
