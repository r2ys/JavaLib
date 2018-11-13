package com.fengwenyi.test;

import com.fengwenyi.javalib.util.StringUtil;
import org.junit.Test;

/**
 * @author Wenyi Feng
 * @since 2018-11-13
 */
public class StringUtilTest {

    @Test
    public void testAutoGenericCode() {
        long startTime = System.nanoTime();
        String rs = StringUtil.autoFill(11, 10);
        System.out.println(rs);
        long endTime = System.nanoTime();
        long time = endTime - startTime;
        System.out.println(time);// 10091896 //12616747
    }

    /*@Test
    public void testFillStr() {
        long startTime = System.nanoTime();
        String rs = StringUtil.autoFill(11, 10000,  "0");
        System.out.println(rs);
        long endTime = System.nanoTime();
        long time = endTime - startTime;
        System.out.println(time); //1083588 // 3614370 // 5562552 // 6608433
    }*/

    @Test
    public void testFill() {
        String rs = StringUtil.autoFill( "Dd", 10,  null, false);
        System.out.println(rs);
    }

    @Test
    public void testHasNum() {
        boolean rs = StringUtil.hasOnlyNum("90000001");
        System.out.println(rs);
    }

}
