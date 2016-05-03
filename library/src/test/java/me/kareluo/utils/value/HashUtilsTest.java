package me.kareluo.utils.value;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by felix on 16/5/3.
 */
public class HashUtilsTest {

    @Test
    public void testHexByte() {
        byte a = -128;
        assertEquals(HashUtils.hex(a), "80");
    }

    @Test
    public void testHexByteI() {
        String a = "Hello are you.";
        assertNotEquals(HashUtils.hex(a.getBytes()), "80");
    }
}
