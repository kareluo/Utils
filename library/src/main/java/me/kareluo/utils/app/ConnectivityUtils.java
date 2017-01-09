package me.kareluo.utils.app;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by felix on 16/12/7.
 */
public class ConnectivityUtils {

    private ConnectivityUtils() {
        /* cannot be instantiated */
    }

    /**
     * 判断网络是否可用
     *
     * @param context 上下文
     * @return true/false
     */
    public static boolean isAvailable(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo != null && networkInfo.isAvailable();
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        return ((ConnectivityManager) context.getSystemService(
                Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
    }

    public static int sss(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        if (networkInfo != null) {
            int type = networkInfo.getType();
            switch (type) {
                case ConnectivityManager.TYPE_MOBILE_DUN:

                    break;
            }

        }
        return 0;
    }


}
