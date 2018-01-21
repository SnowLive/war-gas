package org.decade.gas.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.decade.gas.bean.json.DemoJson;

import java.util.List;

/**
 * Class For:
 *{"state": 0, "msg": "ok", "data": "info"}
 * @auther: decade
 * @date: 17-12-27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseJson {
    private int state;
    private String msg;
    private String data;
    private List<DemoJson> info;
}
