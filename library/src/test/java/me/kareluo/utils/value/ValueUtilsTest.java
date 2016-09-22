package me.kareluo.utils.value;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by felix on 16/4/29.
 */
public class ValueUtilsTest {

    @Test
    public void testIsEmpty() throws Exception {

        String text = null;

        assertTrue(ValueUtils.isEmpty(""));
        assertTrue(ValueUtils.isEmpty(text));

        int[] arrays = new int[111];

        assertFalse(ValueUtils.isEmpty(arrays));


        Object[] a = new Object[20];

        assertFalse(ValueUtils.isEmpty(a));

        Integer[] i = new Integer[22];

        assertFalse(ValueUtils.isEmpty(i));


    }

    @Test
    public void testAsList() {
        long[] ids = new long[]{12, 23, 343};
        List<Long> list = ValueUtils.asList(ids);
        for (int i = 0; i < ids.length; i++) {
            assertTrue(list.get(i).longValue() == ids[i]);
        }
    }

}
