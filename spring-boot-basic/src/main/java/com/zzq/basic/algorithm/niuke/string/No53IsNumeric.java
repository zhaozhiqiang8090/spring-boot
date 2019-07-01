package com.zzq.basic.algorithm.niuke.string;

public class No53IsNumeric {

    public static boolean isNumeric(char[] str) {
        if (str == null || str.length == 0)
            return false;
        int[] index = new int[1];
        index[0] = 0; // 用于记录当前字符位置
        // 先判断A
        boolean isNumeric; //用于记录是否满足条件
        isNumeric = isInteger(str, index);
        // 判断B
        if (isNumeric && index[0] < str.length && (str[index[0]] == '.')) {
            index[0]++;
            isNumeric = isUnsignedInteger(str, index); // .B和A.和A.B形式均可以
        }
        // 判断e后面的A
        if (isNumeric && index[0] < str.length && (str[index[0]] == 'e' || str[index[0]] == 'E')) {
            index[0]++;
            isNumeric = isInteger(str, index);
        }
        if (isNumeric && index[0] == str.length)
            return true;
        else
            return false;
    }

    private static boolean isInteger(char[] str, int[] index) { // 用int[]才能传值，int的话需要定义index为全局变量
        if (index[0] < str.length && (str[index[0]] == '+' || str[index[0]] == '-'))
            index[0]++;
        return isUnsignedInteger(str, index);
    }

    private static boolean isUnsignedInteger(char[] str, int[] index) {
        int start = index[0];
        while (index[0] < str.length && (str[index[0]] - '0' <= 9 && str[index[0]] - '0' >= 0))
            index[0]++;
        if (index[0] > start)
            return true;
        else
            return false;
    }

}
