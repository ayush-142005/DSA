package Leetcode;

public class leetcode202 {
     static boolean isHappy(int n) {
        int fast =n;
        int slow = n;
        do{
            slow=Square(slow);
            fast=Square(Square(fast));
        }
        while(slow!=fast);
        if (slow==-1){
            return true;
        }
        return false;
    }
    static int Square (int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += rem*rem;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}