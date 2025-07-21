package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode350 {
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2,4};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> l1 = new ArrayList<>();
        int n2start_p = 0;
        int n1_start_p = 0;
        while (n1_start_p < nums1.length && n2start_p < nums2.length) {
            if (nums1[n1_start_p] == nums2[n2start_p]) {
                l1.add(nums1[n1_start_p]);
                n1_start_p++;
                n2start_p++;
            } else if (nums1[n1_start_p] < nums2[n2start_p]) {
                n1_start_p++;
            } else {
                n2start_p++;
            }
        }
        int[] res = new int[l1.size()];
        int i = 0;
        for (int num : l1) {
            res[i] = num;
            i++;
        }
        return res;
    }
}
