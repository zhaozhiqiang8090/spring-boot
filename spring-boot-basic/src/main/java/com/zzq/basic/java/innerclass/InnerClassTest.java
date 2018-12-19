package com.zzq.basic.java.innerclass;

public class InnerClassTest {

    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.print();
        System.out.println("----------");
        outer1.new Inner().print();

        System.out.println("----------");
        new Outer2.Inner().print();

        System.out.println("----------");
        new Outer3().outerMethod();
    }

}
