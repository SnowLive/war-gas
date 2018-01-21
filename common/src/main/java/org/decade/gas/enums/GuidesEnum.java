package org.decade.gas.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-21
 */
@AllArgsConstructor
@NoArgsConstructor
public enum GuidesEnum {
    NULL_GUIDES(-201,"该办事指南不存在或未被赋予"),NOT_GUIDES(-202,"办事指南为空");

    @Getter
    private int code;
    @Getter
    private String msg;


}
