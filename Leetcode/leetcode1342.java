package Leetcode;

public class leetcode1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(16));
    }

    static int numberOfSteps(int num) {
        return helper(num,0);
    }
    static int helper(int n, int step){
        if (n==0){
            return step;
        }
        int rem = n%2;
        if (rem==0){
            return helper(n/2,step+1);
        }
        return helper(n-1,step+1);
    }
}
