package com.zzq.basic.algorithm.niuke.string;

public class No2ReplaceSpace {

    public static String replace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        int indexOfOriginal = length - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                length += 2;
        }
        str.setLength(length);
        int indexOfNew = length - 1;
        while (indexOfNew > indexOfOriginal) {
            if (str.charAt(indexOfOriginal) != ' ') {
                str.setCharAt(indexOfNew--, str.charAt(indexOfOriginal));
            } else {
                str.setCharAt(indexOfNew--, '0');
                str.setCharAt(indexOfNew--, '2');
                str.setCharAt(indexOfNew--, '%');
            }
            indexOfOriginal--;
        }
        return str.toString();
    }

}
