package me.kareluo.utils.storage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;

import me.kareluo.utils.app.ConnectivityUtils;

/**
 * Created by felix on 16/4/28.
 */
public class StreamUtils {

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException ignored) {

            }
        }
    }

    public static void close(Closeable... closeables) {
        if (closeables != null) {
            for (Closeable closeable : closeables) {
                close(closeable);
            }
        }
    }

    public static void close(Collection<? extends Closeable> closeables) {
        if (closeables != null) {
            for (Closeable closeable : closeables) {
                close(closeable);
            }
        }
    }

}
