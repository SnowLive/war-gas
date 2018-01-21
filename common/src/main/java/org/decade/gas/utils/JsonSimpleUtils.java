package org.decade.gas.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * Class For:
 * json简单数据解析
 * @auther: decade
 * @date: 17-12-27
 */
public class JsonSimpleUtils {

    private static ObjectMapper mapper = new ObjectMapper();

    /**
     * jsonstr to obj
     * [string,string,string] ok
     * @param jsonStr
     * @param O
     * @param <T>
     * @return
     */
    public static <T> T str2Obj(String jsonStr, Class<T> O) {
        try {
            return mapper.readValue(jsonStr, O);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * json字符串到list的转换.
     *
     * @param jsonStr
     * @param O
     * @param <E>
     * @return
     */
    public static <E> List<E> str2ListObj(String jsonStr, Class<E> O) {
        //1.声明相应参数.
        List<E> objList = new ArrayList<>(20);
        Constructor<E> E_constructor = null;//构造方法
        E tempObj;//成员变量
        Field tempField = null;
        LinkedHashMap<String, Object> obj = null;
        Set<String> set = null;
        Iterator<String> iter = null;
        //2.获取结果,用LinkedHashMapper放.
        try {
            E_constructor = O.getConstructor();
            List<LinkedHashMap<String, Object>> jsonList = mapper.readValue(jsonStr, List.class);
            //2.1 获取其中的数据依次遍历.
            for (int i = 0; i < jsonList.size(); i++) {
                //2.1.1 获取内部数据
                obj = jsonList.get(i);
                //2.1.2 获取所有键值.
                set = obj.keySet();
                //2.1.3 遍历其中的所有数据.
                iter = set.iterator();
                //2.1.4 创建用于存储数据的对象.
                tempObj = E_constructor.newInstance();
                for (; iter.hasNext(); ) {
                    jsonStr = iter.next();
                    //将每一个属性值放入对象中
                    tempField = tempObj.getClass().getDeclaredField(jsonStr);
                    tempField.setAccessible(true);
                    if (tempField.getType().toString().equals("int"))
                        tempField.setInt(tempObj, Integer.parseInt(obj.get(jsonStr).toString()));
                    else tempField.set(tempObj, obj.get(jsonStr));
                }
                //2.2.1 将hashmap中的每一个映射,相应的放入obj对象中存储.
                objList.add(tempObj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return objList;
    }


    public static String obj2Str(Object O) {
        String str = "";
        try {
            str = mapper.writeValueAsString(O);
        } catch (JsonProcessingException e) {
            System.out.println("translation Exception");
        } finally {
            return str;
        }
    }
}
