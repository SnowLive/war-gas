package org.decade.gas.bean.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 * 返回结果
 *
 * @auther: decade
 * @date: 18-1-3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultJson<T> {
    private int code;
    private String msg;
}
