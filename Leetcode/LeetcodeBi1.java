package Leetcode;

public class LeetcodeBi1 {
    public static long splitArray(int[] nums) {
        long sum_A = 0; // Prime indices
        long sum_B = 0; // Non-prime indices
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(i)) {
                sum_A += nums[i];
            } else {
                sum_B += nums[i];
            }
        }
        return Math.abs(sum_A - sum_B);
    }
    public  static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[] ={175868717,841457609,-948571070,-747264172};
        System.out.println(splitArray(nums));
    }
}
