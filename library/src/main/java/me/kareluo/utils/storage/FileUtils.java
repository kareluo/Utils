package me.kareluo.utils.storage;

import java.io.Closeable;
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
     * 根据文件路径穿件一个文件
     *
     * @param path 文件路径
     * @return true 创建了新文件，否则表示问题已存在。
     * @throws IOException
     */
    public static boolean createIfNotExists(String path) throws IOException {
        return createIfNotExists(new File(path));
    }

    /**
     * 如果不存在就创建一个文件
     *
     * @param file 文件
     * @return true 创建了新文件，否则表示问题已存在。
     * @throws IOException
     */
    public static boolean createIfNotExists(File file) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            return file.createNewFile();
        }
        return false;
    }

    /**
     * 关闭流等Closeable对象
     * @param closeable 可关闭对象
     */
    public static void safelyClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException ignored) {

            }
        }
    }

}
