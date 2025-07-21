package Leetcode;

import java.util.*;

public class leetcode15 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threesum(nums));
    }
    // Brute force Approach
    static List<List<Integer>> threeSum_b(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                for (int k = j+1; k < nums.length ; k++) {
                    if (nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(st);
    }
    static List<List<Integer>> threesum(int [] arr){
        if (arr==null || arr.length<3){
            return new ArrayList<>();
        }
        Arrays.sort(arr);
        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i < arr.length-2; i++) {
            int left = i+1;
            int right = arr.length-1;

            while(left<right){
                int sum = arr[i]+arr[right]+arr[left];
                if (sum==0){
                    res.add(Arrays.asList(arr[i],arr[right],arr[left]));
                    left++;
                    right--;
                } else if (sum<0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
