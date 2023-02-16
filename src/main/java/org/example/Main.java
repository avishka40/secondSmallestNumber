package org.example;

import static org.example.SecondSmallestNumber.findSecondSmallest;

public class Main {
    public static void main(String[] args) {

        int[] nums = {3, 5, 1, 4, 6, 8};
        int result = findSecondSmallest(nums);
        System.out.println("Second smallest number: " + result);
    }
}