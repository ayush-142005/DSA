package Leetcode;

import java.util.*;
public class leetcode78 {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(subsets(nums));
    }
    static  List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for(int num :nums) {
            int n =res.size();
            for (int j = 0; j < n; j++) {
                List<Integer> temp = new ArrayList<>(res.get(j));
                temp.add(num);
                res.add(temp);
            }
        }
        return res;
    }
}