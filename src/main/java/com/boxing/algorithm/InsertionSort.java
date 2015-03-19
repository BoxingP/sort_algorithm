package com.boxing.algorithm;

public class InsertionSort implements SortAlgorithm {

    @Override
    public int[] doSort(int[] array) {
        int temp;

        for (int index = 1; index < array.length; index++) {
            temp = array[index];
            int i = index;
            while (i > 0 && array[i - 1] > temp) {
                array[i] = array[i - 1];
                i--;
            }
            array[i] = temp;
        }

        return array;
    }
}
