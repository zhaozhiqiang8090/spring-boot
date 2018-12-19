package com.zzq.basic.java.generic;

import java.io.FileReader;
import java.io.Reader;

//public class GenericThrowable<T> extends Throwable{
//The generic class GenericThrowable<T> may not subclass java.lang.Throwable
public class GenericThrowable<T extends Throwable> {

    public void doWork(T t) throws T {
        try {
//            int i = 3 / 0;

            //这里应该是checked异常
            Reader reader=new FileReader("notfound.txt");
        } catch (Throwable cause) {
            t.initCause(cause);
            throw t;
        }
    }

}
