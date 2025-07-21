package Leetcode;

public class Leetcode50 {
    public static void main(String[] args) {
        System.out.println(myPow(2,10));
    }
    static double myPow(double num, int pow){
        if (num==0){
            return 0;
        }
        if (pow==0){
            return 1;
        }
        if (num==1){
            return 1;
        }
        if(num==-1 && pow%2==1){
            return -1;
        }
        if(num==-1 && pow%2==0){
            return 1;
        }
        int Bin=pow;
        if (pow>Integer.MAX_VALUE){
            ;
        }
        if (Bin<0){
            num=1/num;
            Bin=-1*Bin;
        }
        double ans=1;
        while(Bin>0){
            if (Bin %2==1){
                ans=ans*num;
            }
            num=num*num;
            Bin=Bin/2;
        }
        return ans;
    }
}
