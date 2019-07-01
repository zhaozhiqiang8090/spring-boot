package com.zzq.basic.algorithm.niuke.string;

public class No43RightRotateString {

    public static String rightRotateString(String str, int n) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        int count = n % str.length();
        if (count < 0) {
            count += str.length();
        }
        StringBuilder sb = new StringBuilder(str.substring(str.length() - count));
        sb.append(str.substring(0, str.length() - count));
        return sb.toString();
    }

}
