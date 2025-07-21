package Leetcode;

import java.util.Arrays;

public class leetcode561 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for (int i = 0; i < nums.length/2; i++) {
            sum+=Integer.min(nums[2*i],nums[(2*i)+1]);
        }
        return sum;
    }
    public static int arrayPairSum_(int[] nums){
        Arrays.sort(nums);
        int sum=0;
        for (int i = 0; i < nums.length; i+=2) {
            sum+=Math.min(nums[i],nums[i-1]);
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[]={1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }
}
