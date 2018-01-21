package org.decade.gas.utils;

import org.decade.gas.bean.json.ResultJson;

/**
 * Class For:
 * 结果处理工具
 *
 * @auther: decade
 * @date: 18-1-3
 */
public class ResultUtil {


    public static ResultJson error(int code, String message) {
        ResultJson result = new ResultJson();
        result.setCode(code);
        result.setMsg(message);
        return result;
    }
}
