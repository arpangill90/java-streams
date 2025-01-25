package com.arpan.array;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        int maxSum = doMaxSum(nums);
        System.out.println(maxSum);
    }

    private static int doMaxSum(int[] nums) {
        int maxSoFar = nums[0];
        int maxEnding = nums[0];

        for (int num : nums) {
            maxEnding = Math.max(num, maxEnding + num);
            maxSoFar = Math.max(maxSoFar, maxEnding);
        }
        return maxSoFar;

    }
}
