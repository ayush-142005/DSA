package Leetcode;

public class leetcodeW21 {
    public static boolean checkDivisibility(int n) {
        int orginal =n;
        if (n==0){
            return true;
        }
        int add = 0;
        int mul = 1;
        while(n>0){
            int temp=n%10;
            add+=temp;
            mul*=temp;
            n=n/10;
        }
        if (orginal%(add+mul)==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkDivisibility(23));
        System.out.println(checkDivisibility(0));
    }
}
