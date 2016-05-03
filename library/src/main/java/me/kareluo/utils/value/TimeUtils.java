package me.kareluo.utils.value;

import android.media.TimedText;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

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
     * @return
     */
    public static long getTodayMillis() {
        return getTodayMillis(System.currentTimeMillis());
    }

    /**
     * 获取millis对应的凌晨时间（毫秒），默认时区
     * @param millis
     * @return
     */
    public static long getTodayMillis(long millis) {
        return getTodayMillis(millis, TimeZone.getDefault());
    }

    /**
     * 获取指定时区凌晨时间（毫秒）
     * @param millis
     * @param timeZone
     * @return
     */
    public static long getTodayMillis(long millis, TimeZone timeZone) {
        return millis - (millis + timeZone.getOffset(millis)) % DAY;
    }
}
