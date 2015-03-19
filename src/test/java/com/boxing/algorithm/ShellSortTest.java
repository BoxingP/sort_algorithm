package com.boxing.algorithm;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShellSortTest {
    @Test
    public void shouldInputAnArray_return_sortedArray() {
        SortAlgorithm sortAlgorithm = new ShellSort();
        int[] inputArray = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] outputArray = sortAlgorithm.doSort(inputArray);

        assertThat(outputArray, is(new int[]{2, 7, 10, 34, 42, 56, 67, 88}));
    }
}
