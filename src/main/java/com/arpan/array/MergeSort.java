package com.arpan.array;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8, 10};

        int[] mergedArray = merge(array1, array2);

        System.out.println(Arrays.toString(mergedArray));

        int[] array3 = {2,5, 2, 8, 5};
        System.out.println(Arrays.toString(mergeSort(array3)));
    }

    public static int[] mergeSort(int[] array) {
        if (array.length ==1) {
            return array;
        }

        int midPoint = array.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midPoint));
        int[] right = mergeSort(Arrays.copyOfRange(array, midPoint, array.length));

        return merge(left, right);
    }

    private static int[] merge(int[] array1, int[] array2) {
         int[] combinedArray = new int[array1.length + array2.length];

        int index = 0;
        int i=0;
        int j=0;

        while (i < array1.length && j<array2.length) {
            if (array1[i] < array2[j]) {
                combinedArray[index] = array1[i];
                index++;
                i++;
            } else {
                combinedArray[index] = array2[j];
                index++;
                j++;
            }
        }

        while (i<array1.length) {
            combinedArray[index] = array1[i];
            index++;
            i++;
        }
        while (j<array2.length) {
            combinedArray[index] = array2[j];
            index++;
            j++;
        }

        return combinedArray;

    }
}
