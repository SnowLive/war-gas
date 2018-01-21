package org.decade.gas.enums;

import lombok.AllArgsConstructor;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-6
 */
@AllArgsConstructor
public enum QuestionsEnum {

    NULL_QUESTIONS(-201, "该问题不存在或已被删除"), NOT_QUESTIONS(-202, "常见问题为空");

    private int code;
    private String msg;


    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
