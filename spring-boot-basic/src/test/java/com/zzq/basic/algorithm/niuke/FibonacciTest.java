package com.zzq.basic.algorithm.niuke;

import org.junit.Test;

import static com.zzq.basic.algorithm.niuke.fibonacci.No10RectCover.cover;
import static com.zzq.basic.algorithm.niuke.fibonacci.No10RectCover.cover2;
import static com.zzq.basic.algorithm.niuke.fibonacci.No7Fibonacci.fibonacci;
import static com.zzq.basic.algorithm.niuke.fibonacci.No7Fibonacci.fibonacci2;
import static com.zzq.basic.algorithm.niuke.fibonacci.No8JumpFloor.jump;
import static com.zzq.basic.algorithm.niuke.fibonacci.No8JumpFloor.jump2;
import static com.zzq.basic.algorithm.niuke.fibonacci.No9JumpFloorII.jumpII;

public class FibonacciTest {

    @Test
    public void no7Fibonacci() {
        System.out.println(fibonacci(39));
        System.out.println(fibonacci2(39));
    }

    @Test
    public void no8JumpFloor() {
        System.out.println(jump(39));
        System.out.println(jump2(39));
    }

    @Test
    public void no9JumpFloorII() {
        System.out.println(jumpII(30));
    }

    @Test
    public void no10RectCover() {
        System.out.println(cover(30));
        System.out.println(cover2(30));
    }
}
