package com.zzq.basic.java.initialization;

public class InitialOrderTest {

    public static void main(String[] args) {
        ParentInitialOrder initialOrder  = null;
        System.out.println("----------");
//        initialOrder = new InitialOrder1();
//        initialOrder = new InitialOrder2();
//        initialOrder = new InitialOrder2("a");
//        initialOrder = new Child();
        initialOrder = new InitialOrderByAli("init");
    }

}
