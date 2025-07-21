package Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode217 {
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
//    static boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i!=j && nums[i]==nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
static boolean containsDuplicate(int[] nums){
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
        if (nums[i]==nums[i-1]){
            return true;
        }
    }
    return false;
}
}
