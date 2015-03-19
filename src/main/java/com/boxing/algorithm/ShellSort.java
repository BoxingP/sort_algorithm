package com.boxing.algorithm;

public class ShellSort implements SortAlgorithm {
    @Override
    public int[] doSort(int[] array) {
        int gap = 1;
        while (gap < array.length / 3) {
            gap = gap * 3 + 1;
        }

        for (; gap >= 1; gap /= 3) {
            for (int k = 0; k < gap; k++) {
                for (int i = gap + k; i < array.length; i += gap) {
                    for (int j = i; j >= gap && array[j] < array[j - gap]; j -= gap) {
                        swapNumbers(array, j, j - gap);
                    }
                }
            }
        }
        
        return array;
    }

    private void swapNumbers(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
