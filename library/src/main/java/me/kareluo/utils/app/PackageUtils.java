package me.kareluo.utils.app;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Pair;

/**
 * Created by felix on 16/5/3.
 */
public class PackageUtils {

    private PackageUtils() {
        /* cannot be instantiated */
    }

    public static String getVersionName(Context context, String defaultVersionName) {
        try {
            PackageInfo info = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return info.versionName;
        } catch (PackageManager.NameNotFoundException e) {

        }
        return defaultVersionName;
    }

    public static String getVersionName(Context context) {
        return getVersionName(context, "0");
    }

    public static int getVersionCode(Context context, int defaultVersionCode) {
        try {
            PackageInfo info = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return info.versionCode;
        } catch (PackageManager.NameNotFoundException e) {

        }
        return defaultVersionCode;
    }

    public static int getVersionCode(Context context) {
        return getVersionCode(context, 0);
    }

    public static Pair<String, Integer> getVersion(Context context) {
        try {
            PackageInfo info = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return Pair.create(info.versionName, info.versionCode);
        } catch (PackageManager.NameNotFoundException e) {

        }
        return Pair.create("0", 0);
    }

    public static String getApplicationMetadata(Context context, String key) {
        ApplicationInfo info = null;
        try {
            return String.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(),
                    PackageManager.GET_META_DATA).metaData.get(key));
        } catch (Exception e) {

        }
        return null;
    }
}
