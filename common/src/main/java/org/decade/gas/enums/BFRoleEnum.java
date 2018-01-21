package org.decade.gas.enums;

import lombok.AllArgsConstructor;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-2
 */
@AllArgsConstructor
public enum BFRoleEnum {

    NULL_ROLE(-201, "角色不存在或已被删除"), NOT_ROLE(-202, "插入的角色为空");

    private int code;
    private String msg;


    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
