package com.zzq.basic.algorithm.niuke;

import org.junit.Test;

import static com.zzq.basic.algorithm.niuke.number.No11NumberOf1.numberOf1;
import static com.zzq.basic.algorithm.niuke.number.No12Power.power;
import static com.zzq.basic.algorithm.niuke.number.No31NumberOf1Between1AndN.numberOf1Between1AndN;
import static com.zzq.basic.algorithm.niuke.number.No33GetUglyNumber.getUglyNumber;
import static com.zzq.basic.algorithm.niuke.number.No33GetUglyNumber.getUglyNumber2;
import static com.zzq.basic.algorithm.niuke.number.No46LastRemaining.lastRemaining;
import static com.zzq.basic.algorithm.niuke.number.No47Sum.sum;
import static com.zzq.basic.algorithm.niuke.number.No48Add.add;
import static com.zzq.basic.algorithm.niuke.number.No63StreamMedian.getMedian;
import static com.zzq.basic.algorithm.niuke.number.No63StreamMedian.insert;

public class NumberTest {

    @Test
    public void no11NumberOf1() {
        System.out.println(numberOf1(-10));
    }

    @Test
    public void no12Power() {
        System.out.println(power(2, 5));
    }

    @Test
    public void no31NumberOf1Between1AndN() {
        System.out.println(numberOf1Between1AndN(13));
    }

    @Test
    public void no33GetUglyNumber() {
        System.out.println(getUglyNumber(19));
        System.out.println(getUglyNumber2(19));
    }

    @Test
    public void no46LastRemaining() {
        System.out.println(lastRemaining(6, 7));
    }

    @Test
    public void no47Sum() {
        System.out.println(sum(6));
    }

    @Test
    public void no48Add() {
        System.out.println(add(6, 3));
    }

    @Test
    public void no63StreamMedian() {
        insert(1);
        insert(2);
        System.out.println(getMedian());
    }

}
