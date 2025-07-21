package Leetcode;

public class Leetcode1470 {
    public int[] shuffle(int[] nums, int n) {
        int arr[]= new int[nums.length];
        for (int j = 0; j < arr.length/2; j++) {
        arr[2*j]=nums[j];
        arr[(2*j)+1]= nums[j+n];
        }
        return arr;
    }
}
