package org.decade.gas.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Class For:
 * 行政职权枚举
 *
 * @auther: decade
 * @date: 18-1-14
 */
@AllArgsConstructor
public enum PowersEnum {
    NULL_POWERS(-201, "该行政职权不存在或未被赋予"), NOT_QUESTIONS(-202, "行政职权为空");
    
    @Getter
    private int code;
    @Getter
    private String msg;

}
