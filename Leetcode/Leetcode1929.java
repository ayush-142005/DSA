package Leetcode;

public class Leetcode1929 {
    public static int [] concatination(int [] nums){
        int arr [] = new int[2*(nums.length)];
        for (int i = 0; i < nums.length; i++) {
            arr[i]=nums[i];
        }
        int index = nums.length;
        for (int i = 0; i < nums.length; i++) {
            arr[index]=nums[i];
            index++;
        }
        return arr;
    }
}
