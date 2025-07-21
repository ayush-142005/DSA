package Leetcode;

public class Leetcode26 {
    public static void main(String[] args) {
        
    }
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            else{
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
