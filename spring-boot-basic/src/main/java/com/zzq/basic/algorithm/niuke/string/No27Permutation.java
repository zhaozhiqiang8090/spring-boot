package com.zzq.basic.algorithm.niuke.string;

import com.zzq.basic.algorithm.niuke.array.ArrayUtil;

import java.util.ArrayList;
import java.util.Collections;

public class No27Permutation {

    public static ArrayList<String> permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return list;
        }
        permutationCore(str.toCharArray(), 0, list);
        Collections.sort(list);  //将list中的字符串排序
        return list;
    }

    private static void permutationCore(char[] strArray, int index, ArrayList<String> list) {
        if (index == strArray.length - 1) {
            //判断是否有重复字符串
            if (!list.contains(String.valueOf(strArray))) {
                list.add(String.valueOf(strArray));
            }
        } else {
            for (int i = index; i < strArray.length; i++) {
                ArrayUtil.swap(strArray, index, i);
                permutationCore(strArray, index + 1, list);
                ArrayUtil.swap(strArray, index, i);
            }
        }
    }

}
