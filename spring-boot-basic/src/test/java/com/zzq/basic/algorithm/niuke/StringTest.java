package com.zzq.basic.algorithm.niuke;

import org.junit.Test;

import static com.zzq.basic.algorithm.niuke.string.No2ReplaceSpace.replace;

public class StringTest {

    @Test
    public void no2ReplaceSpace() {
        StringBuffer sb = new StringBuffer("We Are Happy");
        System.out.println(replace(sb));
    }
}
