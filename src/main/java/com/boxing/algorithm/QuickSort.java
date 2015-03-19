package com.boxing.algorithm;

public class QuickSort implements SortAlgorithm {
    int[] array;

    @Override
    public int[] doSort(int[] array) {
        this.array = array;
        doQuickSort(this.array, 0, this.array.length - 1);
        return this.array;
    }

    private void doQuickSort(int[] array, int left, int right) {

        int i = left, j = right;
        int pivot = median(array, left, right);

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swapNumbers(array, i, j);
                i++;
                j--;
            }
        }
        if (left < j)
            doQuickSort(array, left, j);
        if (i < right)
            doQuickSort(array, i, right);
    }

    private int median(int[] array, int left, int right) {
        int center = (left + right) / 2;

        if (array[left] > array[center])
            swapNumbers(array, left, center);
        if (array[left] > array[right])
            swapNumbers(array, left, right);
        if (array[center] > array[right])
            swapNumbers(array, center, right);

        swapNumbers(array, center, right - 1);
        return array[right - 1];
    }

    private void swapNumbers(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
