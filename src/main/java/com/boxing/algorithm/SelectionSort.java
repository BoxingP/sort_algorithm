package com.boxing.algorithm;

public class SelectionSort implements SortAlgorithm {
    @Override
    public int[] doSort(int[] array) {
        int min;
        for (int index = 0; index < array.length - 1; index++) {
            min = index;
            for (int temp = index + 1; temp < array.length; temp++) {
                if (array[temp] < array[min]) min = temp;
            }
            swapNumbers(array, min, index);
        }
        return array;
    }

    private void swapNumbers(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
