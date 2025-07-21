package Leetcode;

import java.util.Arrays;

public class hrproductofarray {
    public static void main(String[] args) {
        int nums[] ={1,2,3,4};
        System.out.println(Arrays.toString(sum1(nums)));
    }
//    static int [] product_(int [] n){
//        int product=1;
//        int l1 [] = new int[n.length];
//        for (int i = 0; i <n.length ; i++) {
//            if (n[i]!=0) {
//                product = product * n[i];
//            }
//        }
//        for (int i = 0; i <n.length ; i++) {
//            if (n[i]==0){
//                n[i]=0;
//            }
//            l1[i]=product/n[i];
//        }
//        return l1;
//    }
    static int [] sum1 (int[] nums){
        int left = 1;
        int right = 1;
        int [] l1 = new int[nums.length];
        for (int i = nums.length-1; i >=0 ; i--) {
            l1[i]=right;
            right=right*nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            l1[i]=l1[i]*left;
            left=left*nums[i];
        }
        return l1;

    }

}
