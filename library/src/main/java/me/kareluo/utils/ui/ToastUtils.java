package me.kareluo.utils.ui;

import android.content.Context;
import android.support.annotation.StringRes;
import android.widget.Toast;

/**
 * Created by felix on 16/4/29.
 */
public class ToastUtils {

    public static void show(Context context, CharSequence text, int duration) {
        Toast.makeText(context, text, duration).show();
    }

    public static void show(Context context, @StringRes int resId, int duration) {
        Toast.makeText(context, resId, duration).show();
    }

    public void show(Context context, CharSequence text) {
        show(context, text, Toast.LENGTH_SHORT);
    }

    public void show(Context context, @StringRes int resId) {
        show(context, resId, Toast.LENGTH_SHORT);
    }
}
