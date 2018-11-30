package com.zzq.basic.java.string;

import java.util.Arrays;

/**
 * jdk1.6中String.subString(...);方法存在内存泄漏问题
 * 原因：该方法直接把当前String对象的大数组value[]赋值给新对象，导致空间浪费
 * jdk1.7中已通过Arrays.copy();重新定义新的小数组解决
 */
public class MyString {

    /**
     * 注意：final可以通过反射来破坏。。
     */
    private final char value[];

    public MyString() {
        char empty[] = {' '};
        this.value = empty;
    }

    public MyString(MyString original) {
        this.value = original.value;
    }

    public MyString(char value[]) {
        this.value = Arrays.copyOf(value, value.length);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char c:value) {
            sb.append(c);
        }
        return sb.toString();
    }

}
