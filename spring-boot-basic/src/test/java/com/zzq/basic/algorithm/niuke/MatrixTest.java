package com.zzq.basic.algorithm.niuke;

import com.zzq.basic.algorithm.niuke.linkedlist.ListUtil;
import com.zzq.basic.algorithm.niuke.matrix.MatrixUtil;
import org.junit.Test;

import java.util.ArrayList;

import static com.zzq.basic.algorithm.niuke.matrix.No19PrintMatrix.printMatrix;
import static com.zzq.basic.algorithm.niuke.matrix.No1Find.find;

public class MatrixTest {

    @Test
    public void no1Find() {
        int[][] a = MatrixUtil.init(5, 5);
        MatrixUtil.printMatrix(a);
        System.out.println(find(24, a));
    }

    @Test
    public void no19PrintMatrix() {
        int[][] matrix = MatrixUtil.init(5, 3);
        MatrixUtil.printMatrix(matrix);
        ArrayList<Integer> list = printMatrix(matrix);
        ListUtil.printList(list);
    }
}
