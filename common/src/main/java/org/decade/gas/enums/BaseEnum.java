package org.decade.gas.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Class For:
 * 基本枚举类.
 *
 * @auther: decade
 * @date: 17-12-28
 */
@NoArgsConstructor
public enum BaseEnum {

    ERROR_PAGE(-102, "当前页数错误"),
    BaseError(-101, "基本错误"),
    JDBCCONNECT(-503,"服务器无法连接");

    @Getter
    private int code;
    @Getter
    private String msg;

    BaseEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


}
