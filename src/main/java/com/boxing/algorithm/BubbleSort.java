package com.boxing.algorithm;

public class BubbleSort implements SortAlgorithm {
    @Override
    public int[] doSort(int[] array) {
        
        for (int index = 0; index<array.length-1;index++) {
            for (int i = 0; i < array.length - 1-index; i++) {
                if (isLargerThanAfter(array, i)) {
                    swapNumbers(array, i);
                }
            }
        }

        return array;
    }

    private boolean isLargerThanAfter(int[] array, int i) {
        return array[i] > array[i + 1];
    }

    private void swapNumbers(int[] array, int i) {
        int temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temp;
    }
}
