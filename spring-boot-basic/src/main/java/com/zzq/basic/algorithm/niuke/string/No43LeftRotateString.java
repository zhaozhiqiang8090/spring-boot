package com.zzq.basic.algorithm.niuke.string;

public class No43LeftRotateString {

    public static String leftRotateString(String str, int n) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        int count = n % str.length();
        if (count < 0) {
            count += str.length();
        }
        StringBuilder sb = new StringBuilder(str.substring(count));
        sb.append(str.substring(0, count));
        return sb.toString();
    }

}
