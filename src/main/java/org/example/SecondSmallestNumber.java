package org.example;
import java.util.Arrays;

public class SecondSmallestNumber {

    public static int findSecondSmallest(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Input array must have at least two elements");
        }
        Arrays.sort(nums);
        return nums[1];
    }

}

