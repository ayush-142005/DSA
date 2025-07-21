package Leetcode;

public class leetcode35 {
    public static void main(String[] args) {
        int nums[]={1,3};
        System.out.println(searchInsert(nums,2));
    }
    static int searchInsert(int[] nums, int target) {
        int left =0;
        int right =nums.length;
        while (left<right){
            int mid = left+(right-left)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]>target){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return right;
    }
}
