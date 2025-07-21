package Leetcode;

import java.util.*;

public class leetcode18 {
    public static void main(String[] args) {
        int arr[] ={1000000000,1000000000,1000000000,1000000000};
        System.out.println(fourSum_(arr,-294967296));
    }
    static List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums==null || nums.length<4){
            return new ArrayList<>();
        }
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i+1; j <nums.length-2 ; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left = j+1;
                int right = nums.length-1;
                while (left<right){
                    long sum = nums[i]+nums[right]+nums[left]+nums[j];
                    if (sum==target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    }
                    else if (sum>target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
    static List<List<Integer>> fourSum_(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return res;
        }
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // skip duplicates
                int left = j + 1, right = n - 1;
                while (left < right) {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        // skip duplicates
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
