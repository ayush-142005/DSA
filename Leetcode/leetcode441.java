package Leetcode;

public class leetcode441 {
    public static void main(String[] args) {
        // Test case: 5 coins should result in 2 complete rows.
        System.out.println(arrangeCoins(5)); // Expected: 2
        // Test case: 6 coins should result in 3 complete rows.
        System.out.println(arrangeCoins(6)); // Expected: 3
        // Test case: 0 coins should result in 0 complete rows.
        System.out.println(arrangeCoins(0)); // Expected: 0
        // Test case: 1 coin should result in 1 complete row.
        System.out.println(arrangeCoins(1)); // Expected: 1
        // Test case: 3 coins should result in 2 complete rows (1+2=3, 0 remaining).
        System.out.println(arrangeCoins(1804289383)); // Expected: 2
    }
    static int arrangeCoins(int n) {
        long start =0;
        long end =n;
        while (start<=end){
            long mid = start+(end-start)/2;
            long k = mid*(mid+1)/2;

            if (k==n){
                return (int) mid;
            }
            if (k<n){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return (int)end;
    }
}
