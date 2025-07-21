package Leetcode;

import java.util.*;
import java.util.Set;
public class leetcode349 {
    public static void main(String[] args) {
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> l1= new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            int left =0;
            int right = nums1.length;
            while(left<=right){
                int mid=left+(right-left)/2;
                if (nums1[mid]==nums2[i]){
                    l1.add(nums1[mid]);
                    break;
                }
                if (nums1[mid]>nums2[i]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        int i=0;
        int []res = new int [l1.size()];
        for (int num : l1) {
            res[i] = num;
            i++;
        }
        return res;
    }
}
