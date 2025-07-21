package Leetcode;

public class Leetcode169 {
    public static void main(String[] args) {
        int nuums[] ={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nuums));
    }
// Brute force O(N*N)
//    static int majorityElement(int[] nums) {
//        int n = nums.length;
//        int count=0;
//        if (nums.length==1){
//            return nums[0];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i]==nums[j] && i!=j){
//                    count++;
//                }
//            }
//            if (count>n/2){
//                return nums[i];
//
//            }
//        }
//        return -1;
//    }
    static int majorityElement(int[] nums){
        // Moore's Voting Algorithm
        int n = nums.length;
        int count =0;
        int element = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count==0){
                count=1;
                element=nums[i];
            } else if (nums[i]==element) {
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==element){
                count1++;
            }
            if (count1>n/2){
                return element;
            }
        }
        return -1;
    }
}
