package com.boxing.algorithm;

public class MergeSort implements SortAlgorithm {
    private int[] array;
    private int[] helper;

    @Override
    public int[] doSort(int[] array) {
        this.array = array;
        this.helper = new int[array.length];
        mergeSort(0, array.length - 1);
        return this.array;
    }

    private void mergeSort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;

            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        System.arraycopy(array, low, helper, low, high + 1 - low);

        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                array[k] = helper[i];
                i++;
            } else {
                array[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            array[k] = helper[i];
            k++;
            i++;
        }
    }
}