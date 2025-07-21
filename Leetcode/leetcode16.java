package Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int gap = Integer.MAX_VALUE;
        int res=0;
        for (int fixed_p = 0; fixed_p < nums.length-2; fixed_p++) {
            int left = fixed_p+1;
            int right = nums.length-1;
            while(left<right){
                int sum=nums[fixed_p]+nums[left]+nums[right];
                if (sum<target){
                    if (sum-target<gap){
                        gap=sum-target;
                        res=sum;
                    }
                    left++;
                } else if (target<sum){
                    if (sum-target<gap){
                        gap=sum-target;
                        res=sum;
                    }
                    right--;
                }
                else {
                    return target;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nums [] ={-1,2,1,-4};
        int nums1 []={-1,2,1,-4};
        System.out.println(threeSumClosest(nums1,1));
        System.out.println(threeSumClosest(nums,2));
    }
}
