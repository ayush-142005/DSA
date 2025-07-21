package Leetcode;

import java.util.Arrays;

public class leetcode167 {
    public static void main(String[] args) {
        int [] numbers ={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(numbers,9)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int i =0;
        int j = numbers.length-1;
        while (i<j){
            if (numbers[i]+numbers[j]==target){
                return new int [] {i+1,j+1};
            }
            if (numbers[i]+numbers[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int [] {-1,-1};
    }
}
