package me.kareluo.utils.value;

import java.util.TimeZone;

/**
 * Created by felix on 16/5/3.
 */
public class TimeUtils {

    public static final long SECOND = 1000L;
    public static final long MINUTE = 60 * SECOND;
    public static final long HOUR = 60 * MINUTE;
    public static final long DAY = 24 * HOUR;

    private TimeUtils() {
        /* cannot be instantiated */
    }

    /**
     * 获取当天凌晨时间（毫秒）
     * @return 今天凌晨时间戳
     */
    public static long getTodayMillis() {
        return getTodayMillis(System.currentTimeMillis());
    }

    /**
     * 获取millis对应的凌晨时间（毫秒），默认时区
     * @param millis 时间戳
     * @return
     */
    public static long getTodayMillis(long millis) {
        return getTodayMillis(millis, TimeZone.getDefault());
    }

    /**
     * 获取指定时区凌晨时间（毫秒）
     * @param millis 时间戳
     * @param timeZone 时区
     * @return 凌晨时间戳
     */
    public static long getTodayMillis(long millis, TimeZone timeZone) {
        return millis - (millis + timeZone.getOffset(millis)) % DAY;
    }
}
