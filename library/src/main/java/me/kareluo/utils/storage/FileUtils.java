package me.kareluo.utils.storage;

import java.io.File;
import java.io.IOException;

/**
 * Created by felix on 16/4/29.
 */
public class FileUtils {

    private FileUtils() {
        /* cannot be instantiated */
    }

    /**
     * @param path
     * @return true if the file has been created, false if it
     * already exists.
     * @throws IOException
     */
    public static boolean createIfNotExists(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            return file.createNewFile();
        }
        return false;
    }


}
