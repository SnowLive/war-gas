package org.decade.gas.bean.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Class For:
 * json obj
 *
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseJsonObj<T> {

    private int state;
    private String msg;
    private List<T> data;

}
