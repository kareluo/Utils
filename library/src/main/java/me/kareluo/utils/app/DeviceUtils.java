package me.kareluo.utils.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;

/**
 * Created by felix on 16/5/3.
 */
public class DeviceUtils {

    private DeviceUtils() {
        /* cannot be instantiated */
    }

    public static int dp2px(Context context, float dp) {
        return Math.round(context.getResources().getDisplayMetrics().density * dp);
    }

    public static float px2dp(Context context, int px) {
        return px / context.getResources().getDisplayMetrics().density;
    }

    public static int getDeviceWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getDeviceHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static Pair<Integer, Integer> getDeviceSize(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return Pair.create(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isAvailable();
    }

    public static String getDeviceId(Context context) {
        TelephonyManager telephonyManager =
                (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        return telephonyManager.getDeviceId();
    }

    public static String getPhoneBrand() {
        return android.os.Build.BRAND;
    }

    /**
     * 截屏
     *
     * @param activity
     * @param withStatusBar 是否包含状态栏
     * @return 返回截屏后的Bitmap对象
     */
    public static Bitmap captureScreenshot(Activity activity, boolean withStatusBar) {
        int statusBarHeight = 0;
        View view = activity.getWindow().getDecorView();
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        if (!withStatusBar) {
            Rect frame = new Rect();
            view.getWindowVisibleDisplayFrame(frame);
            statusBarHeight = frame.top;
        }
        Pair<Integer, Integer> deviceSize = getDeviceSize(activity);
        Bitmap bitmap = Bitmap.createBitmap(
                view.getDrawingCache(), 0, statusBarHeight, deviceSize.first, deviceSize.second - statusBarHeight);
        view.destroyDrawingCache();
        return bitmap;
    }

}
