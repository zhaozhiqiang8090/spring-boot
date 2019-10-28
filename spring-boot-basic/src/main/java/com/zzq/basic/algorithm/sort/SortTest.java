package com.zzq.basic.algorithm.sort;

import com.zzq.basic.algorithm.sort.linearTimeNoncomparative.BucketSort;
import com.zzq.basic.algorithm.sort.linearTimeNoncomparative.CountingSort;
import com.zzq.basic.algorithm.sort.linearTimeNoncomparative.RadixSort;
import com.zzq.basic.algorithm.sort.nonlinearTimeComparative.BubbleSort;
import com.zzq.basic.algorithm.sort.nonlinearTimeComparative.HeapSort;
import com.zzq.basic.algorithm.sort.nonlinearTimeComparative.SelectionSort;

public class SortTest {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 2, 6, 9, 7, 8, 0, -1, -10, 20, 300};
//        int[] array = {-101,};
        SortUtils.printPart(array);

//        BubbleSort.bubbleSort(array);
//        SelectionSort.selectionSort(array);
//        InsertionSort.insertionSort(array);

//        QuickSort.quickSort(array, 0, array.length - 1);
//        MergeSort.mergeSortUp2Down(array, 0, array.length - 1);
        HeapSort.heapSort(array);

//        CountingSort.countingSort(array);
//        BucketSort.bucketSort(array, 10);
//        RadixSort.radixSort(array);

//        SortUtils.printPart(array);
    }

}
