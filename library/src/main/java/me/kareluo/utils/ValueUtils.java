package me.kareluo.utils;

import android.support.annotation.Nullable;

import java.util.Collection;

/**
 * Created by felix on 16/4/28.
 */
public class ValueUtils {

    public static boolean isEmpty(@Nullable CharSequence sequence) {
        return sequence == null || sequence.length() == 0;
    }

    public static <T> boolean isEmpty(@Nullable T[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    public static boolean isEmpty(@Nullable Collection collection) {
        return collection == null || collection.isEmpty();
    }
}
