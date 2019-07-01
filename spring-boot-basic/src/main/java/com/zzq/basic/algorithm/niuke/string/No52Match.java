package com.zzq.basic.algorithm.niuke.string;

public class No52Match {

    public static boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null)
            return false;
        return matchCore(str, 0, pattern, 0);
    }

    private static boolean matchCore(char[] str, int indexOfStr, char[] pattern, int indexOfPattern) {
        if (indexOfStr == str.length && indexOfPattern == pattern.length)
            return true;
        if (indexOfStr < str.length && indexOfPattern == pattern.length)
            return false;
        if (indexOfPattern + 1 < pattern.length && pattern[indexOfPattern + 1] == '*') {
            if (indexOfStr < str.length && (pattern[indexOfPattern] == str[indexOfStr] || pattern[indexOfPattern] == '.')) {
                return matchCore(str, indexOfStr, pattern, indexOfPattern + 2) //当前字符匹配0次
                        || matchCore(str, indexOfStr + 1, pattern, indexOfPattern) //当前字符匹配多次
                        || matchCore(str, indexOfStr + 1, pattern, indexOfPattern + 2); //当前字符匹配1次
            } else {
                return matchCore(str, indexOfStr, pattern, indexOfPattern + 2);
            }
        }
        if (indexOfStr < str.length && (pattern[indexOfPattern] == str[indexOfStr] || pattern[indexOfPattern] == '.'))
            return matchCore(str, indexOfStr + 1, pattern, indexOfPattern + 1);
        return false;
    }

}
