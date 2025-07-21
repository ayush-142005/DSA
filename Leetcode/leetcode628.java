package Leetcode;

import java.util.Arrays;

public class leetcode628 {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int first = nums[n-1] * nums[n-2] * nums[n-3];
        int sec = nums[0] * nums[1] * nums[n-1];

        return Math.max(first, sec);
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        System.out.println(maximumProduct(nums));
    }
}
