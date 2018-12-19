package com.zzq.basic.java.enumration;

public class EnumrationTest {

    public static void main(String[] args) {
//        new MarriageCode("1","1");
        for (MarriageCode mc : MarriageCode.values()) {
            System.out.println(mc.getCode() + mc.getMsg() + mc.getShowMsg());
        }
    }
}
