package org.decade.gas.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Class For:
 * 随机名字生成器。
 *
 * @auther: decade
 * @date: 18-1-8
 */
public class RandomUtils {

    public static final String BASE_FIRST_NAME = "赵钱孙李周吴郑王冯陈楚卫蒋沈韩杨";
    public static final String BASE_PUBLIC_NAME = "扎安抚道阿囧开扥金卡江嫂轮番卡斯丹肯借阿当发窘况法拉撒旦法空档翻看阿桑单方";


    public static ThreadLocalRandom getRandom() {
        return ThreadLocalRandom.current();
    }

    @Deprecated
    public static String randomName(int length) {
        return randomString(BASE_FIRST_NAME, length);
    }

    //    获取随机字符串
    public static String randomString(String baseString, int length) {
        StringBuilder sb = new StringBuilder();
        if (length < 1) {
            length = 1;
        }
        int baseLength = baseString.length();
        int number = 1;
        for (int i = 0; i < length; ++i) {
            number = getRandom().nextInt(baseLength);
            sb.append(baseString.charAt(number));
        }
        return sb.toString();
    }

    public static int randomNum(int length) {
        return Integer.parseInt(randomString("1234567890", length));
    }

    public static String randomDate(String yearStr) {
        return "19" + RandomUtils.randomString(yearStr, 2)
                + "-" + RandomUtils.randomString("123456789", 1)
                + "-" + RandomUtils.randomString("13456789", 1);
    }

    public static String randomPhone() {
        return 1 + randomString("1234567890", 10);
    }

    public static String randName(int length) {
        length = length < 0 ? 1 : length;
        return randomName(1) + randomString(BASE_PUBLIC_NAME, length);
    }

    public static <T> List<T> randList(List<T> o, int length) {
        length = (length < 0 || length < o.size()) ? 1 : length;
        int size = o.size();
        List<T> result = new ArrayList<>();
        int num;
        for (int i = 0; i < length; i++) {
            num = getRandom().nextInt(size);
            result.add(o.get(num));
        }
        return result;
    }

    @Test
    public void test() {
        for (int i = 0; i < 30; i++) {
            System.out.print(randName(2) + " ");
            System.out.println(randName(1));
        }
    }


}


