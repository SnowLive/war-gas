package org.decade.gas.exception;

import org.decade.gas.enums.GuidesEnum;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-21
 */
public class GuidesException extends BaseException {


    public GuidesException(GuidesEnum en) {
        super(en.getCode(), en.getMsg());
    }

    public GuidesException(int code, String msg) {
        super(code, msg);
    }
}
