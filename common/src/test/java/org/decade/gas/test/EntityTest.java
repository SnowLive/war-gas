package org.decade.gas.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.decade.gas.bean.json.DemoJson;
import org.decade.gas.test.entity.BaseJson;
import org.decade.gas.utils.JsonSimpleUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 17-12-25
 */
public class EntityTest {

    @Test
    public void test() {
        String jsonstr = "{\"state\": 2, \"msg\": \"ok\", \"data\": \"公职人员\", \"info\": [{\"state\": 1, \"msg\": \"ok\", \"data\": \"snowlive\"}, {\"state\": 2, \"msg\": \"ok\", \"data\": \"yinzhenkun\"}, {\"state\": 3, \"msg\": \"ok\", \"data\": \"shengyunt\"}]}";
        BaseJson obj = JsonSimpleUtils.str2Obj(jsonstr, BaseJson.class);
        Assert.assertEquals(obj.getState(), 2);
        System.out.println(obj);
    }

    @Test
    public void test1() {
        DemoJson obj = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            obj = mapper.readValue("{\"state\":1, \"msg\":\"hello snowlive jsonUtils\", \"data\":\"info\"}", DemoJson.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(obj.getData(), "info");
        System.out.println(obj);
    }


}
