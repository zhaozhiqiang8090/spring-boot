package com.zzq.basic.algorithm.niuke.string;

public class No52Match {

    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null)
            return false;
        return matchCore(str, 0, pattern, 0);
    }

    private boolean matchCore(char[] str, int indexOfStr, char[] pattern, int indexOfPattern) {
        if (indexOfStr == str.length && indexOfPattern == pattern.length)
            return true;
        if (indexOfStr < str.length && indexOfPattern == pattern.length)
            return false;
        if (indexOfPattern + 1 < pattern.length && pattern[indexOfPattern + 1] == '*') {
            if ((indexOfStr < str.length && pattern[indexOfPattern] == '.')
                    || (indexOfStr < str.length && pattern[indexOfPattern] == str[indexOfStr])) {
                return matchCore(str, indexOfStr, pattern, indexOfPattern + 2)
                        || matchCore(str, indexOfStr + 1, pattern, indexOfPattern)
                        || matchCore(str, indexOfStr + 1, pattern, indexOfPattern + 2);
            } else {
                return matchCore(str, indexOfStr, pattern, indexOfPattern + 2);
            }
        }
        if (indexOfStr < str.length && (pattern[indexOfPattern] == str[indexOfStr] || pattern[indexOfPattern] == '.'))
            return matchCore(str, indexOfStr + 1, pattern, indexOfPattern + 1);
        return false;
    }

}
