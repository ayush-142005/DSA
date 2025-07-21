package Leetcode;

import java.util.*;
public class Leetcode2089 {
    public static void main(String[] args) {
        int nums[]={1,2,5,2,3};
        System.out.println(targetIndices(nums,2));
    }
    static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        int lessCount = 0, equalCount = 0;
        for (int num : nums) {
            if (num < target) lessCount++;
            else if (num == target) equalCount++;
        }

        for (int i = 0; i < equalCount; i++) {
            result.add(lessCount + i);
        }

        return result;
    }
}
