package org.decade.gas.exception;

import org.decade.gas.enums.BFRoleEnum;

/**
 * Class For:
 *  角色运行时异常
 *
 * @auther: decade
 * @date: 18-1-2
 */
public class BFRoleException extends BaseException {


    public BFRoleException(BFRoleEnum en) {
        super(en.getCode(), en.getMsg());
    }

    public BFRoleException(int code, String msg) {
        super(code, msg);
    }
}
