package com.zzq.basic.java.generic;

import java.util.Comparator;

//'java.util.Comparator' cannot be inherited with different type arguments: 'com.zzq.basic.java.generic.Parent' and 'com.zzq.basic.java.generic.Son'
//public class Son extends Parent<String> implements Comparator<Son> {
public class Son extends Parent<String> implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Son && o2 instanceof Son) {
            if((Son)o1 == (Son) o2)
                return 0;
        }
        return 0;
    }

    /**
     * 重写setName方法
     * 反编译文件包含两个setName方法：setName(Object obj)，setName(String name)
     * setName(Object obj)内部调用setName((String)obj)
     *
     * @param name
     */
    @Override
    public void setName(String name) {
        System.out.println("son:" + name);
    }

    public void setName2(String name) {
        System.out.println("son:" + name);
    }

}
