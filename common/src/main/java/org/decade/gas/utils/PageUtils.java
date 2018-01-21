package org.decade.gas.utils;

import org.decade.gas.enums.BaseEnum;
import org.decade.gas.exception.BaseException;

/**
 * Class For:
 *
 * @auther: decade
 * @date: 18-1-1
 */
public class PageUtils {

    /**
     * 获得开始页
     *
     * @param current 当前页
     * @param size    大小
     * @return 开始位置
     */
    public static int getStart(int current, int size) {
        if (current <= 0)
            throw new BaseException(BaseEnum.ERROR_PAGE);
        return (current - 1) * size;
    }

    /**
     * 页码校验工具 正确的返回true
     *
     * @param current 当前页
     * @param total   总数
     * @param size    大小
     */
    public static void check(int current, int total, int size) {
        if (!checkPage(current, total, size))
            throw new BaseException(BaseEnum.ERROR_PAGE);
    }

    private static boolean checkPage(int current, int total, int size) {
        if (current <= 0)
            return false;

        if (total == 0)
            return true;

        if (total % size == 0)
            return current <= total / size;
        else
            return current <= total / size + 1;
    }
}
