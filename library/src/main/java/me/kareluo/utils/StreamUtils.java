package me.kareluo.utils;

import android.renderscript.ScriptGroup;
import android.support.annotation.Nullable;
import android.util.Log;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by felix on 16/4/28.
 */
public class StreamUtils {

    public static void close(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {

            }
        }
    }


}
