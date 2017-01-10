package me.kareluo.utils.storage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import me.kareluo.utils.Logger;

/**
 * Created by felix on 16/4/29.
 */
public class FileUtils {

    private static final String TAG = "FileUtils";

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
            boolean mkdirs = false;
            if (!parentFile.exists()) {
                mkdirs = parentFile.mkdirs();
            }
            return mkdirs || file.createNewFile();
        }
        return false;
    }

    public static boolean createDirIfNotExists(File dir) {
        if (!dir.exists() || !dir.isDirectory()) {
            File parentFile = dir.getParentFile();
            boolean mkdirs = false;
            if (!parentFile.exists()) {
                mkdirs = parentFile.mkdirs();
            }
            return mkdirs || dir.mkdir();
        }
        return false;
    }

    /**
     * 关闭流等Closeable对象
     *
     * @param closeable 可关闭对象
     */
    public static void safelyClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Logger.w(TAG, e);
            }
        }
    }

    /**
     * 判断文件是否不为null且存在
     *
     * @param file 文件
     * @return true/false
     */
    public static boolean exists(File file) {
        return file != null && file.exists();
    }

}
