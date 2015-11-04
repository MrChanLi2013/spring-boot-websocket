package com.cl.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private final static SimpleDateFormat sdfTime;

    static {
        sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 获取格式为 yyyy-MM-dd HH:mm:ss 的时间
     *
     * @return 时间字符串
     */
    public static String getTime() {
        return sdfTime.format(new Date());
    }

}
