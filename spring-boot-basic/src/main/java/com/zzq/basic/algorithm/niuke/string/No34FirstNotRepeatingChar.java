package com.zzq.basic.algorithm.niuke.string;

import java.util.HashMap;
import java.util.Map;

public class No34FirstNotRepeatingChar {

    public static int firstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        char target = ' ';
        for (char c : chars) {
            if (map.get(c) != null && map.get(c) == 1) {
                target = c;
                break;
            }
        }
        if (target != ' ') {
            return str.indexOf(target);
        }
        return -1;
    }

}
