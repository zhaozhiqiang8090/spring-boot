package com.zzq.basic.java.generic;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    private static void genericClassTest() {
        GenericClass<String> genericClass = new GenericClass<>("gc1");
        System.out.println(genericClass.getField().getClass());
        System.out.println("----------");
    }

    private static void genericMethodTest() {
        String[] serial = {"abc", "123", " "};
        Object o1 = GenericMethod.getMiddle(serial);
        System.out.println(o1.getClass());

        Object o2 = GenericMethod.getMiddle("213", 0, "12");
        System.out.println(o2.getClass());

        new GenericMethod<String>().sayHi1("abc");
        new GenericMethod<String>().sayHi1(123);
        new GenericMethod<Integer>().sayHi2(123);
        new GenericMethod<GenericClass>().sayHi3(GenericClass.class);

        System.out.println("----------");
    }

    private static void limitTest() {
        GenericClass<String> gc1 = new GenericClass();
        //1.error
//        if (gc1 instanceof GenericClass<String>) {}
        //2.warn
        GenericClass<String> gc2 = (GenericClass<String>) gc1;
        //3.true
        System.out.println(gc1.getClass() == gc2.getClass());
        //4.error
        GenericClass<String>[] gc3 = null;
//        gc3 = new GenericClass<String>[10];
        gc3 = (GenericClass<String>[]) new GenericClass<?>[10];
    }

    private static void qualifierTest() {
        Identifier qualifier = new Identifier();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        qualifier.setField(list);
    }

    private static void genericThrowableTest() {
        GenericThrowable<RuntimeException> obj = new GenericThrowable<>();
        obj.doWork(new RuntimeException("why?"));
    }

    private static void overrideTest() {
        Son son = new Son();
        son.setName("s abc");
//        son.setName(new Object());//The method setName(String) in the type Son is not applicable for the arguments (Object)
        son.setName2("s2 abc");
        System.out.println("----------");

        Parent p = son;
//        p.setName(new Object());//Exception in thread "main" java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
        p.setName("ps abc");
        ((Son) p).setName2("ps2 abc");
        System.out.println("----------");

        Parent parent = new Parent();
        parent.setName("p abc");
        parent.setName(new Object());
    }

    public static void wildcardTest() {
        //子类型通配符(上边界通配符)。用子类set，无超级子类，故不可set
        Parent<Integer> bean1 = new Parent<Integer>();
        bean1.setMsg(123);
        Parent<? extends Number> bean2 = bean1;
//        bean2.setMsg(10);// 编译错误
        Number s1 = bean2.getMsg();
        Object o1 = bean2.getMsg();
        System.out.println(s1);
        System.out.println("----------");

        //超类型通配符(下边界通配符)。用超类get，超级超类Object，故可随时get
        Parent<? super Integer> bean22 = bean1;
        bean22.setMsg(100);
//        Integer s2 = bean22.getMsg();// 编译错误
        Object o11 = bean22.getMsg();// ok
        System.out.println(o11);
        System.out.println("----------");

        //无限定通配符(<Object> 同 不写)。可set，可get
//        Parent<Object> bean111 = new Parent<>();
        Parent bean111 = bean1;
        bean111.setMsg(1000);
        bean111.setMsg(new Object());
//        Integer s111 = bean111.getMsg();// 编译错误
        Object o111 = bean111.getMsg();// ok
        System.out.println(o111);
        System.out.println("----------");

        //无限定通配符（<?> 同 <? extends Object>）。无法确定类，故不可set
        Parent<? extends Object> bean222 = bean1;
//        Parent<?> bean222 = new Parent<>();
//        bean222.setMsg(10000);// 编译错误
//        bean222.setMsg(new Object());// 编译错误
//        Integer s222 = bean222.getMsg();// 编译错误
        Object o222 = bean222.getMsg();// ok
        System.out.println(o222);
        System.out.println("----------");
    }

    public static void wildcardCaptureTest() {
        WildcardCapture<String> wc = new WildcardCapture<>();
        wc.setKey("key");
        wc.setValue("value");
        WildcardCapture.show(wc);
        WildcardCapture.swapV2(wc);
        WildcardCapture.show(wc);
    }

    public static void extensionTest() {
        Parent<String> p1 = new Parent<>();
        p1.setMsg("tom");
        System.out.println(p1.getMsg());
        Parent p2 = p1;
        p2.setMsg(new File("1.txt"));
        System.out.println(p2.getMsg());
        System.out.println("----------");

        Parent<? extends Son> ps = new Parent<>();
        Parent<? extends Parent> pp = new Parent<>();
//        ps = pp;// error
        pp = ps;

        Parent<Object> po = new Parent<>();
        Parent<?> pWhat = new Parent<>();
        Parent p = new Parent<>();
//        po = pWhat;// error
        pWhat = po;
        p = pWhat;
        pWhat = p;
    }

    public static void main(String[] args) {
//        genericClassTest();
//        genericMethodTest();
//        limitTest();
//        qualifierTest();
//        genericThrowableTest();
//        overrideTest();
//        wildcardTest();
//        wildcardCaptureTest();
        extensionTest();
    }
}
