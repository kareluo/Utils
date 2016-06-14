package me.kareluo.utils.value;

import java.util.Collection;

/**
 * Created by felix on 16/4/28.
 */
public class ValueUtils {

    private ValueUtils() {
        /* cannot be instantiated */
    }

    /**
     * 判空
     *
     * @param sequence 字符串
     * @return 是否为空
     */
    public static boolean isEmpty(CharSequence sequence) {
        return sequence == null || sequence.length() == 0;
    }

    /**
     * 判空
     *
     * @param arrays byte[]
     * @return 是否为空
     */
    public static boolean isEmpty(byte[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    /**
     * 判空
     *
     * @param arrays int[]
     * @return 是否为空
     */
    public static boolean isEmpty(int[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    /**
     * 判空
     *
     * @param arrays int[]
     * @return 是否为空
     */
    public static boolean isEmpty(short[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    /**
     * 判空
     *
     * @param arrays char[]
     * @return 是否为空
     */
    public static boolean isEmpty(char[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    /**
     * 判空
     *
     * @param arrays boolean[]
     * @return 是否为空
     */
    public static boolean isEmpty(boolean[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    /**
     * 判空
     *
     * @param arrays long[]
     * @return 是否为空
     */
    public static boolean isEmpty(long[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    /**
     * 判空
     *
     * @param arrays float[]
     * @return 是否为空
     */
    public static boolean isEmpty(float[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    /**
     * 判空
     *
     * @param arrays double[]
     * @return 是否为空
     */
    public static boolean isEmpty(double[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    /**
     * 判空
     *
     * @param arrays T[]
     * @return 是否为空
     */
    public static <T> boolean isEmpty(T[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    /**
     * 判空
     *
     * @param collection Collection
     * @return 是否为空
     */
    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * 比较两值是否相同
     *
     * @param a 参数a
     * @param b 参数b
     * @return 是否相同
     */
    public static boolean equals(Object a, Object b) {
        return (a == null) ? (b == null) : a.equals(b);
    }
}
