package com.zzq.basic.java.innerclass;

public class Outer3 {

//    private Inner inner = new Inner();

    private int data = 3;

    public void print() {
        System.out.println(data);
//        System.out.println(inner.data);
    }

    public void outerMethod() {

        final int localData = 300;

        class Inner {

            private int data = 30;

            public void print() {
                System.out.println(data);
                System.out.println(Outer3.this.data);
                System.out.println(localData);
            }

        }

        new Inner().print();
    }

}
