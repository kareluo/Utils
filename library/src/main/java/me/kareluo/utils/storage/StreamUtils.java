package me.kareluo.utils.storage;

import java.io.Closeable;
import java.io.IOException;

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

}
