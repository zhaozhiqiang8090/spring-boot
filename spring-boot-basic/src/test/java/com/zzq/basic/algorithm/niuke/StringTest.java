package com.zzq.basic.algorithm.niuke;

import com.zzq.basic.algorithm.niuke.linkedlist.ListUtil;
import com.zzq.basic.algorithm.niuke.string.No27Permutation;
import com.zzq.basic.algorithm.niuke.string.No54FirstCharacterInStream;
import org.junit.Test;

import java.util.ArrayList;

import static com.zzq.basic.algorithm.niuke.string.No2ReplaceSpace.replace;
import static com.zzq.basic.algorithm.niuke.string.No34FirstNotRepeatingChar.firstNotRepeatingChar;
import static com.zzq.basic.algorithm.niuke.string.No43LeftRotateString.leftRotateString;
import static com.zzq.basic.algorithm.niuke.string.No44ReverseSentence.reverseSentence;
import static com.zzq.basic.algorithm.niuke.string.No49StrToInt.strToInt;

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
    public void no44ReverseSentence() {
        String s = " student. a am I ";
        System.out.println(reverseSentence(s));
    }

    @Test
    public void no49StrToInt() {
        String s = " student. a am I ";
        System.out.println(strToInt(s));
    }

    @Test
    public void no52Match() {

    }

    @Test
    public void no53IsNumeric() {

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
