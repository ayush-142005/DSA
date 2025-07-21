package Sorting;

import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int nums [] ={5,4,3,2,1};
        sort_(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    static void sort_(int [] nums,int low , int high){
        if (low>=high){
            return;
        }
        int start =low;
        int end =high;
        int mid=start+(end-start)/2;
        int pivot=nums[mid];
        while (start<=end){
            // If the arr is already sorted
            while(nums[start]<pivot){
                start++;
            }
            while(nums[end]>pivot){
                end--;
            }
            if (start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
    // when the pivot is at the correct position
        sort_(nums,low,end);
        sort_(nums,start,high);
    }
}
