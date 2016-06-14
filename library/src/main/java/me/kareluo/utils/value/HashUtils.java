package me.kareluo.utils.value;

import java.security.MessageDigest;

/**
 * Created by felix on 16/5/3.
 */
public class HashUtils {

    private static final char[] UPPER_CASE_DIGITS = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    private HashUtils() {
        /* cannot be instantiated */
    }

    /**
     * MD5值
     *
     * @param bytes 字节数组
     * @return MD5哈希后的字符数组
     */
    public static byte[] md5(byte[] bytes) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            return messageDigest.digest(bytes);
        } catch (Exception ignored) {

        }
        return new byte[0];
    }

    /**
     * 转换成HEX字符串
     *
     * @param bytes 字符数组
     * @return HEX字符串
     */
    public static String hex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) sb.append(hex(b));
        return sb.toString();
    }

    /**
     * 转换成HEX字符
     *
     * @param b 字节
     * @return HEX字符
     */
    public static String hex(byte b) {
        return new String(new char[]{UPPER_CASE_DIGITS[(b >> 4) & 0x0f], UPPER_CASE_DIGITS[b & 0x0f]});
    }

}
