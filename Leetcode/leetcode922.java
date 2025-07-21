package Leetcode;

import java.util.Arrays;

public class leetcode922 {
    public static void main(String[] args) {
        int arr [] ={4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }
    static int[] sortArrayByParityII(int[] nums) {
        int arr[] = new int[nums.length];
        int odd_=1;
        int even_=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                arr[even_]=nums[i];
                even_+=2;
            }
            else {
                arr[odd_]=nums[i];
                odd_+=2;
            }
        }
        return arr;
    }
}
