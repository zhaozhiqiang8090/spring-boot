package com.zzq.basic.java.string;

import java.util.Arrays;

public class StringTest {

    private char value[];

    public StringTest() {
        char empty[] = {' '};
        this.value = empty;
    }

    public StringTest(StringTest original) {
        this.value = original.value;
    }

    public StringTest(char value[]) {
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

    public static void main(String[] args) {
        char value1[] = {'a', 'b'};
        StringTest st1 = new StringTest(value1);
        StringTest st2 = new StringTest(st1);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println("----------");

//        char value2[] = {'b'};
        st2.value[1] = 'c';
        System.out.println(st1);
        System.out.println(st2);
    }
}
