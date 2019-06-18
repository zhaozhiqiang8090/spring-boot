package com.zzq.basic.algorithm.niuke.string;

public class No49StrToInt {

    public static int strToInt(String str) {
        if (str == null || str.length() <= 0)
            return 0;
        char[] chars = str.toCharArray();
        long num = 0;  //先用long来存储，以防止越界
        boolean minus = false;
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 && chars[i] == '-') {
                minus = true;
            } else if (i != 0 || chars[i] != '+') {
                int a = chars[i] - '0';
                if (a < 0 || a > 9) {
                    return 0;
                }
                num = !minus ? num * 10 + a : num * 10 - a;
                if ((!minus && num > 0x7FFFFFFF)
                        || (minus && num < 0x80000000)) {
                    return 0;
                }
            }
        }
        return (int) num;
    }

}
