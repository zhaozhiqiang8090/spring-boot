package com.zzq.common.service.impl;

import com.zzq.common.service.Car;

//@Component
public class BMW implements Car {

    @Override
    public void print() {
        System.out.println("我是一个宝马");
    }
}
