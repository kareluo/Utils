package me.kareluo.utils.value;

import android.support.annotation.Nullable;

import java.util.Collection;

/**
 * Created by felix on 16/4/28.
 */
public class ValueUtils {

    private ValueUtils() {
        /* cannot be instantiated */
    }

    public static boolean isEmpty(@Nullable CharSequence sequence) {
        return sequence == null || sequence.length() == 0;
    }

    public static boolean isEmpty(byte[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    public static boolean isEmpty(int[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    public static boolean isEmpty(short[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    public static boolean isEmpty(char[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    public static boolean isEmpty(boolean[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    public static boolean isEmpty(long[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    public static boolean isEmpty(float[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    public static boolean isEmpty(double[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    public static <T> boolean isEmpty(T[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    public static boolean isEmpty(@Nullable Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean equals(Object a, Object b) {
        return (a == null) ? (b == null) : a.equals(b);
    }
}
