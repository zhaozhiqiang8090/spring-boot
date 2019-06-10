package com.zzq.basic.algorithm.common;

public class LongestCommonSubSequence {

    /**
     * 最长公共子序列
     *
     * @param str1
     * @param str2
     * @return
     */
    public static int lcs(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int countMax = 0;     //记录最长公共子串长度
        int c[][] = new int[len1 + 1][len2 + 1];
        int endI = 0; // 记录最长公共子串末尾位置
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0 || j == 0) {
                    c[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                    if (c[i][j] > countMax) {
                        countMax = c[i][j];
                        endI = i;
                    }
                } else {
                    c[i][j] = 0;
                }
            }
        }

        // 包含begin，不包含end
        String subString = str1.substring(endI - countMax, endI);
        System.out.println(subString);

        return countMax;
    }

    public static void main(String[] args) {
        String s1 = "abcdefg";
//        String s2 = "ghijklmn";
        String s2 = "acdbcdde";
        System.out.println(lcs(s1, s2));
    }
}
