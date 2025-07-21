package Leetcode;

import java.util.Arrays;

public class leetcode75 {
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sortColors(int[] nums) {
        int start =0;
        int end = nums.length-1;
        int mid = 0;
        while(mid<=end) {
            if (nums[mid]==0){
               swap(nums,start,mid);
               start++;
               mid++;
            } else if (nums[mid]==1) {
                mid++;
            }else{
                swap(nums,mid,end);
                end--;
            }
        }
    }

    private static void swap(int [] nums,int p1,int p2) {
        int temp =nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;
    }
}
