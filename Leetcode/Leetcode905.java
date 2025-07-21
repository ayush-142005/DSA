package Leetcode;

import java.util.Arrays;

public class Leetcode905 {
    public static void main(String[] args) {
        int arr []={3,1,2,4};
        int []num=sortArrayByParity(arr);
        System.out.println(Arrays.toString(num));
    }
    static int[] sortArrayByParity(int[] nums) {
        int arr [] = new int[nums.length];
        int t=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                arr[t]=nums[i];
                t++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==1){
                arr[t]=nums[i];
                t++;
            }
        }
        return arr;
    }
}
