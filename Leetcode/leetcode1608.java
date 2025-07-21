package Leetcode;

public class leetcode1608 {
    public static void main(String[] args) {
        int nums [] ={3,5};
        System.out.println(specialArray(nums));
    }
    static int specialArray(int[] nums) {
        int n = nums.length;
        for (int x = 0; x <= n; x++) {
            int count = 0;
            for (int num : nums) {
                if (num >= x) count++;
            }
            if (count == x) return x;
        }
        return -1;
    }
}
