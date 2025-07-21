package Leetcode;

public class leetcode231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo_(3));
    }
    static boolean isPowerOfTwo(int n) {
        for (int i = 0; i < n; i++) {
            if (Math.pow(2,i)==n && Math.pow(2,i)<=n){
                return true;
            }
        }
        return false;
    }

    static boolean isPowerOfTwo_(int n) {
        if (n==0){
            return false;
        }
        while (n!=1){
            if (n%2==0){
                n=n/2;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
