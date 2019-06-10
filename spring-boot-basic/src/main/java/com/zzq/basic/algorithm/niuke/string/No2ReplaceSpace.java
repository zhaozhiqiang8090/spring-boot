package com.zzq.basic.algorithm.niuke.string;

public class No2ReplaceSpace {

    /**
     * 替换空格为“%20”
     *
     * @param str
     * @return
     */
    public static String replace(StringBuffer str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str.replace(i, i + 1, "%20");
            }
        }

        return str.toString();
    }

}
