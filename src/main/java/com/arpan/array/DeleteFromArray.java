package com.arpan.array;

import java.util.Arrays;

public class DeleteFromArray {
    public static void main(String[] args) {
        int[] nums3 = {-1, -2, -3, -4, -5};
        int val3 = -1;
        int newLength3 = removeElement(nums3, val3);
        System.out.println("Test case 3: Modified array: " +
                Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3)) +
                "\nNew length: " + newLength3);
    }

    private static int removeElement(int[] nums, int val) {
        int begin = 0;
        for (int i =0; i< nums.length; i++) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[begin];
                nums[begin] = temp;
                begin++;
            }
        }
        return nums.length - begin;
    }
}
