package org.decade.gas.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * Class For:
 * 唯一uuid工程
 *
 * @auther: decade
 * @date: 17-12-27
 */
public class UUIDFactory {

    public static String createUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    @Test
    public void test() {
        String str = UUID.randomUUID().toString();
        System.out.println(str);
        System.out.println(str.replace("-", ""));
    }

}
