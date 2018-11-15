package com.zzq.commontraining.service.impl;

import com.zzq.commontraining.service.Car;
import org.springframework.stereotype.Component;

//@Component
public class BMW implements Car {

    @Override
    public void print() {
        System.out.println("我是一个宝马");
    }
}
