package com.zzq.basic.java.innerclass;

public class Outer2 {

    private Inner inner = new Inner();

    private int data = 2;

    private static int data2 = 22;

    public void print() {
        System.out.println(data);
        System.out.println(inner.data);
    }

    public static class Inner {

        private int data = 20;

        public void print() {
            System.out.println(data);
//            System.out.println(Outer2.this.data);
            System.out.println(Outer2.data2);
        }

    }

}
