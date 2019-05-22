package com.zzq.basic.algorithm;

import static java.lang.Math.max;

public class LongestCommonSubSequence {

    public static int lcs(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int result = 0;     //记录最长公共子串长度
        int c[][] = new int[len1 + 1][len2 + 1];
        int iMax = 0; // 记录最长公共子串末尾位置
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0 || j == 0) {
                    c[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
//                    result = max(c[i][j], result);
                    if (c[i][j] > result) {
                        result = c[i][j];
                        iMax = i;
                    }
                } else {
                    c[i][j] = 0;
                }
            }
        }

        // 包含begin，不包含end
        String subString = str1.substring(iMax - result, iMax);
        System.out.println(subString);

        return result;
    }

    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "ghijklmn";
//        String s2 = "acdbcdde";
        System.out.println(lcs(s1, s2));
    }
}
