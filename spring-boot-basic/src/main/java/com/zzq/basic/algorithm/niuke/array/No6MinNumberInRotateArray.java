package com.zzq.basic.algorithm.niuke.array;

public class No6MinNumberInRotateArray {

    public static int findMin(int[] array) {
        if (array == null || array.length <= 0) {
            throw new RuntimeException("invalid array");
        }

        int indexLow = 0;
        int indexHigh = array.length - 1;
        //旋转数组为排序数组本身的特例
        int indexMiddle = indexLow;
        while (array[indexLow] >= array[indexHigh]) {
            if (indexHigh - indexLow == 1) {
                indexMiddle = indexHigh;
                break;
            }
            //考虑两侧数字和中间数字相同的特殊情况，采用顺序查找算法查找最小值
            indexMiddle = (indexLow + indexHigh) / 2;
            if (array[indexMiddle] == array[indexLow] && array[indexHigh] == array[indexLow]) {
                return findMinInOrder(array, indexLow, indexHigh);
            }

            if (array[indexMiddle] >= array[indexLow]) {
                indexLow = indexMiddle;
            } else {
                indexHigh = indexMiddle;
            }
        }
        return array[indexMiddle];
    }

    /**
     * 顺序查找
     *
     * @param array
     * @param indexLow
     * @param indexHigh
     * @return
     */
    private static int findMinInOrder(int[] array, int indexLow, int indexHigh) {
        int result = array[indexLow];
        for (int i = indexLow + 1; i < indexHigh; i++) {
            if (array[i] < result) {
                result = array[i];
                break;
            }
        }
        return result;
    }

}
