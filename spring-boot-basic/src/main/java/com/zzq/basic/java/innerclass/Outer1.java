package com.zzq.basic.java.innerclass;

public class Outer1 {

    private Inner inner = new Inner();

    private int data = 1;

    public void print() {
        System.out.println(data);
        System.out.println(inner.data);
    }

    public class Inner {

        private int data = 10;

        public void print() {
            System.out.println(data);
            System.out.println(Outer1.this.data);
        }

    }

}
