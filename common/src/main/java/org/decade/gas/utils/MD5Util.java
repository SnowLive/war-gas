package org.decade.gas.utils;

/**
 * Created by snowlive on 17-8-14.
 * Class For:
 */
public class MD5Util {
    //MD5加密
    public static String getMD5Str(String str){
        MD5_Encoding md5 = new MD5_Encoding();
        return md5.getMD5ofStr(str);
    }

}
