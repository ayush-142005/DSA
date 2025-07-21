package Leetcode;

import java.util.ArrayList;

public class Leetcode1431 {
    public int[] createTargetArray(int[] nums, int[] index) {
      ArrayList<Integer> l1 = new ArrayList<>();
      for (int i = 0; i < nums.length; i++) {
        l1.add(index[i],nums[i]);
      }
      int result [] = new int[nums.length]; 
      for (int i = 0; i < result.length; i++) {
        result[i]=l1.get(i);
      }
      return result;
    }
    }

