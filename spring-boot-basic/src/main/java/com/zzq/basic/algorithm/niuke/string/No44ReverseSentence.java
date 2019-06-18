package com.zzq.basic.algorithm.niuke.string;

public class No44ReverseSentence {

    public static String reverseSentence(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        int start = chars.length - 1;
        int end = chars.length - 1;
        while (start >= 0) {
            if (chars[start] == ' ') {
                for (int i = start + 1; i <= end; i++) {
                    sb.append(chars[i]);
                }
                sb.append(' ');
                end = start - 1;
            } else if (start == 0) {
                for (int i = start; i <= end; i++) {
                    sb.append(chars[i]);
                }
            }
            start--;
        }
        return sb.toString();
    }

}
