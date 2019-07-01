package com.zzq.basic.algorithm.niuke;

import com.zzq.basic.algorithm.niuke.linkedlist.ListUtil;
import com.zzq.basic.algorithm.niuke.string.No27Permutation;
import com.zzq.basic.algorithm.niuke.string.No54FirstCharacterInStream;
import org.junit.Test;

import java.util.ArrayList;

import static com.zzq.basic.algorithm.niuke.string.No2ReplaceSpace.replace;
import static com.zzq.basic.algorithm.niuke.string.No34FirstNotRepeatingChar.firstNotRepeatingChar;
import static com.zzq.basic.algorithm.niuke.string.No43LeftRotateString.leftRotateString;
import static com.zzq.basic.algorithm.niuke.string.No43RightRotateString.rightRotateString;
import static com.zzq.basic.algorithm.niuke.string.No44ReverseSentence.reverseSentence;
import static com.zzq.basic.algorithm.niuke.string.No49StrToInt.strToInt;
import static com.zzq.basic.algorithm.niuke.string.No52Match.match;
import static com.zzq.basic.algorithm.niuke.string.No53IsNumeric.isNumeric;

public class StringTest {

    @Test
    public void no2ReplaceSpace() {
        StringBuffer sb = new StringBuffer("We Are Happy");
        System.out.println(replace(sb));
    }

    @Test
    public void no27Permutation() {
        String s = "abc";
        ArrayList<String> list = No27Permutation.permutation(s);
        ListUtil.printList(list);
    }

    @Test
    public void no34FirstNotRepeatingChar() {
        String s = "google";
        System.out.println(firstNotRepeatingChar(s));
    }

    @Test
    public void no43LeftRotateString() {
        String s = "abcXYZdef";
        System.out.println(leftRotateString(s, -1));
    }

    @Test
    public void no43RightRotateString() {
        String s = "abcXYZdef";
        System.out.println(rightRotateString(s, -1));
    }

    @Test
    public void no44ReverseSentence() {
        String s = " student. a am  I ";
        System.out.println(reverseSentence(s));
    }

    @Test
    public void no49StrToInt() {
        String s = " student. a am I ";
        System.out.println(strToInt(s));
    }

    @Test
    public void no52Match() {
        char[] str = {'a', 'a', 'a'};
        char[] pattern1 = {'a', '.', 'a'};
        char[] pattern2 = {'a', 'b', '*', 'a', 'c', '*', 'a'};
        char[] pattern3 = {'a', 'a', '.', 'a'};
        char[] pattern4 = {'a', 'b', '*', 'a'};
        System.out.println(match(str, pattern1));
        System.out.println(match(str, pattern2));
        System.out.println(match(str, pattern3));
        System.out.println(match(str, pattern4));
    }

    @Test
    public void no53IsNumeric() {
        char[] chars1 = {'+', '1', '0', '0'};
        System.out.println(isNumeric(chars1));
        char[] chars2 = {'5', 'e', '2'};
        System.out.println(isNumeric(chars2));
        char[] chars3 = {'-', '1', '2', '3'};
        System.out.println(isNumeric(chars3));
        char[] chars4 = {'1', '.', '3', 'e', '4'};
        System.out.println(isNumeric(chars4));
        char[] chars5 = {'-', '1', 'E', '-', '1', '6'};
        System.out.println(isNumeric(chars5));

//        char[] chars6 = {'1', '2', 'e'};
//        System.out.println(isNumeric(chars6));
//        char[] chars7 = {'1', 'a', '3', '.', '1', '4'};
//        System.out.println(isNumeric(chars7));
//        char[] chars8 = {'1', '.', '2', '.', '3'};
//        System.out.println(isNumeric(chars8));
//        char[] chars9 = {'+', '-', '5'};
//        System.out.println(isNumeric(chars9));
//        char[] chars10 = {'1', '2', 'e', '+', '4', '.', '3'};
//        System.out.println(isNumeric(chars10));
    }

    @Test
    public void no54FirstCharacterInStream() {
        No54FirstCharacterInStream firstCharacterInStream = new No54FirstCharacterInStream();
        System.out.println(firstCharacterInStream.firstAppearingOnce());
        firstCharacterInStream.insert('g');
        firstCharacterInStream.insert('o');
        System.out.println(firstCharacterInStream.firstAppearingOnce());
        firstCharacterInStream.insert('o');
        firstCharacterInStream.insert('g');
        firstCharacterInStream.insert('l');
        firstCharacterInStream.insert('e');
        System.out.println(firstCharacterInStream.firstAppearingOnce());
    }

}
