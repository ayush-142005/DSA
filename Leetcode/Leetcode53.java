package Leetcode;

public class Leetcode53 {
    public static void main(String[] args) {
        
    }
    public static int maxSubArray(int[] nums) {
        int max_value = Integer.MIN_VALUE;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            current+=nums[i];
            if(current<0){
                current=0;
            }
            if(max_value<current){
                max_value = current;
            }
        }
        return max_value;
        
    }

}
